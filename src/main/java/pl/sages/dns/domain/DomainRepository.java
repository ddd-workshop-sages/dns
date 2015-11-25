package pl.sages.dns.domain;

interface DomainRepository {

    void save(Domain domain);
    Domain findByDomainName(DomainName domainName);
}
