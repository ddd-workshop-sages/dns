package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.time.Period;

public class DomainUpdateRequest {

    private Registrant registrant;
    private NameServers nameServers;

    public Registrant getRegistrant() {
        return registrant;
    }

    public NameServers getNameServers() {
        return nameServers;
    }
}
