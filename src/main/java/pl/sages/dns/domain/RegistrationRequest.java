package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.time.Period;
import java.util.Set;

public class RegistrationRequest {

    private DomainName domainName;
    private Period period;
    private Registrant registrant;
    private Registrar.RegistrarId registrarId;
    private NameServers nameServers;

    public DomainName getDomainName() {
        return domainName;
    }

    public Period getPeriod() {
        return period;
    }

    public Registrant getRegistrant() {
        return registrant;
    }

    public Registrar.RegistrarId getRegistrarId() {
        return registrarId;
    }

    public NameServers getNameServers() {
        return nameServers;
    }

    public RegistrationRequest merge(ReservationRequest reservation) {
        if (registrant == null) {
            registrant = reservation.getRegistrant();
        }
        // same for others, when it makes sense
        return this; // TODO: construct new instead of mutating
    }
}
