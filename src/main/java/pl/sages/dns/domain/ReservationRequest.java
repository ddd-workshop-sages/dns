package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.util.Set;

public class ReservationRequest {

    private DomainName domainName;
    private String name;
    private Zone zone;
    private Registrant registrant;
    private Registrar.RegistrarId registrarId;
    private NameServers nameServers;

    public DomainName getDomainName() {
        return domainName;
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
}
