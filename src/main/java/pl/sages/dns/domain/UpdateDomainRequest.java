package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

public class UpdateDomainRequest {

    private DomainName domainName;
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
