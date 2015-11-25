package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Set;

public class Domain {

    private static final ZoneId TIMEZONE = ZoneId.of("UTC");    // TODO: clock instead of ZoneID

    private DomainName domainName;
    private NameServers nameServers;
    private Registrant registrant;
    private Registrar.RegistrarId registrarId;
    private LocalDateTime created;
    private LocalDateTime validTill;
    private boolean isRegistered;

    public Domain(DomainName domainName, Period period, Registrant registrant, Registrar.RegistrarId registrarId, NameServers nameServers, boolean isRegistered) {
        this.domainName = domainName;
        this.registrant = registrant;
        this.registrarId = registrarId;
        this.isRegistered = isRegistered;
        this.nameServers = nameServers;
        this.created = LocalDateTime.now(TIMEZONE);
        this.validTill = created.plus(period);
    }

    public void prolong(Period period) {
        validTill = validTill.plus(period);
    }
}
