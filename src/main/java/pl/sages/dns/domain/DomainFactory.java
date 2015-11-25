package pl.sages.dns.domain;

import java.time.Period;

class DomainFactory {

    private static final Period RESERVATION_PERIOD = Period.ofDays(3);

    Domain registeredDomain(RegistrationRequest request) {
       return new Domain(request.getDomainName(), request.getPeriod(), request.getRegistrant(), request.getRegistrarId(),request.getNameServers(), true);
    }

    Domain reservedDomain(ReservationRequest request) {
        return new Domain(request.getDomainName(), RESERVATION_PERIOD, request.getRegistrant(), request.getRegistrarId(),request.getNameServers(), false);
    }
}
