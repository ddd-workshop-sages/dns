package pl.sages.dns.domain;

import java.util.Map;

interface DomainRepository {

    void save(Domain domain);
    Domain findByDomainName(DomainName domainName);
    boolean isDomainAvailable(DomainName domainName); // neither registered nor reserved nor in expiration period
}
