package pl.sages.dns.domain;

import java.util.Optional;

interface ReservationRepository {

    void save(ReservationRequest reservation);
    Optional<ReservationRequest> findByDomainName(DomainName domainName);
}
