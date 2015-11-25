package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class Domain {

    private static final ZoneId TIMEZONE = ZoneId.of("UTC");    // TODO: clock instead of ZoneID

    private DomainName domainName;
    private NameServers nameServers;
    private Registrant registrant;
    private Registrar.RegistrarId registrarId;
    private LocalDateTime created;
    private LocalDateTime validTill;

    public static Domain registerNewDomain(RegistrationRequest registrationRequest) {
        return registerDomain(registrationRequest);
    }

    public static Domain registerReservedDomain(RegistrationRequest registration, ReservationRequest reservation) {
        checkArgument(requestsHaveSameRegistrar(registration, reservation));
        // check if it's for the same domain
        RegistrationRequest completeRegistrationRequest = registration.merge(reservation);
        return registerDomain(completeRegistrationRequest);
    }

    private static boolean requestsHaveSameRegistrar(RegistrationRequest registration, ReservationRequest reservation) {
        return registration.getRegistrarId().equals(reservation.getRegistrarId());
    }

    private static Domain registerDomain(RegistrationRequest registration) {
        checkNotNull(registration.getNameServers());
        //same for others

        checkArgument(registration.getNameServers().areValid());
        return new Domain(registration.getDomainName(), registration.getPeriod(), registration.getRegistrant(), registration.getRegistrarId(), registration.getNameServers());
    }

    private Domain(DomainName domainName, Period period, Registrant registrant, Registrar.RegistrarId registrarId, NameServers nameServers) {
        this.domainName = domainName;
        this.registrant = registrant;
        this.registrarId = registrarId;
        this.nameServers = nameServers;
        this.created = LocalDateTime.now(TIMEZONE);
        this.validTill = created.plus(period);
    }

    public void renew(Period period) {
        validTill = validTill.plus(period);
    }

    public void update(UpdateDomainRequest update) {
        checkArgument(registrarId.equals(update.getRegistrarId()));
        if (update.getRegistrant() != null) {
            registrant = update.getRegistrant();
        }
        // same for others where it makes sense
    }
}
