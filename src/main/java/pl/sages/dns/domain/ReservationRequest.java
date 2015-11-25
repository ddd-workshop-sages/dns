package pl.sages.dns.domain;

import pl.sages.dns.registrar.Registrar;

import java.util.Set;

public class ReservationRequest {

    private String name;
    private Zone zone;
    private Registrant registrant;
    private Registrar.RegistrarId registrarId;

    public String getName() {
        return name;
    }

    public Zone getZone() {
        return zone;
    }

    public Registrant getRegistrant() {
        return registrant;
    }

    public Registrar.RegistrarId getRegistrarId() {
        return registrarId;
    }
}
