package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.time.Period;
import java.util.Set;

public class RegistrationRequest {

    private String name;
    private Zone zone;
    private Period period;
    private Registrant registrant;
    private Registrar.RegistrarId registrarId;
    private Set<NameServer> nameServers;

    public String getName() {
        return name;
    }

    public Zone getZone() {
        return zone;
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

    public Set<NameServer> getNameServers() {
        return nameServers;
    }
}
