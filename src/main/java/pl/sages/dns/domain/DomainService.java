package pl.sages.dns.domain;


import java.time.Period;

import static com.google.common.base.Preconditions.checkState;

public class DomainService {

    private DomainFactory domainFactory;
    private DomainRepository domainRepository;

    public void registerDomain(RegistrationRequest request) {
        checkState(domainRepository.isDomainAvailable(request.getName(), request.getZone()), "domain not available");
        Domain domain = domainFactory.registeredDomain(request);
        domainRepository.save(domain);
    }

    public void reserveDomain(ReservationRequest request) {
        checkState(domainRepository.isDomainAvailable(request.getName(), request.getZone()), "domain not available");
        Domain domain = domainFactory.reservedDomain(request);
        domainRepository.save(domain);
    }

    public boolean isDomainAvailable(String name, Zone zone) {
        return domainRepository.isDomainAvailable(name, zone);
    }

    public void prolongDomain(String domainName, Period period) {
        Domain domain = domainRepository.findByDomainName(domainName);
        domain.prolong(period);
    }
}
