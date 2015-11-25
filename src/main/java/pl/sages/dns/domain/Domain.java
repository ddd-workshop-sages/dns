package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Set;

public class Domain {

    private static final ZoneId TIMEZONE = ZoneId.of("UTC");    // TODO: clock instead of ZoneID

    private Zone zone;
    private String name;
    private Set<NameServer> nameServers;
    private Registrant registrant;
    private Registrar.RegistrarId registrarId;
    private LocalDateTime created;
    private LocalDateTime validTill;
    private boolean isRegistered;

    public Domain(String name, Zone zone, Period period, Registrant registrant, Registrar.RegistrarId registrarId, boolean isRegistered) {
        this.name = name;
        this.zone = zone;
        this.registrant = registrant;
        this.registrarId = registrarId;
        this.isRegistered = isRegistered;
        this.created = LocalDateTime.now(TIMEZONE);
        this.validTill = created.plus(period);
    }

    public void setNameServers(Set<NameServer> nameServers) {
        this.nameServers = nameServers;
    }

    public String getDomainName() {
        return name + '.' + zone.getName();
    }


    public void prolong(Period period) {
        validTill = validTill.plus(period);
    }
}
