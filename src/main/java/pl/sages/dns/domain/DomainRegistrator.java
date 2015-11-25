package pl.sages.dns.domain;

import java.util.Optional;

public class DomainRegistrator {

    private ReservationRepository reservationRepository;

    public Domain registerDomain(RegistrationRequest registration) {
        Optional<ReservationRequest> reservation = reservationRepository.findByDomainName(registration.getDomainName());
        if (reservation.isPresent()) {return  Domain.registerReservedDomain(registration, reservation.get());
        } else {
            return Domain.registerNewDomain(registration);
        }
    }

    public void reserveDomain(ReservationRequest reservation) {
        reservationRepository.save(reservation);
    }
}
