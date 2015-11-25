package pl.sages.dns.domain;

import java.util.Map;

interface DomainRepository {

    void save(Domain domain);
    Domain findByDomainName(String domainName);
    boolean isDomainAvailable(String name, Zone zone); // neither registered nor reserved nor in expiration period
}
