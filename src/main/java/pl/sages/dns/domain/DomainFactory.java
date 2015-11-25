package pl.sages.dns.domain;

import java.time.Period;

class DomainFactory {

    private static final Period RESERVATION_PERIOD = Period.ofDays(3);

    Domain registeredDomain(RegistrationRequest request) {
        Domain domain = new Domain(request.getName(), request.getZone(), request.getPeriod(), request.getRegistrant(), request.getRegistrarId(), true);
        domain.setNameServers(request.getNameServers());
        return domain;
    }

    Domain reservedDomain(ReservationRequest request) {
        return new Domain(request.getName(), request.getZone(), RESERVATION_PERIOD, request.getRegistrant(), request.getRegistrarId(), false);
    }
}
