package pl.sages.dns.domain;

public class DomainName {
    private Zone zone;
    private String name;

    public DomainName(Zone zone, String name) {
        this.zone = zone;
        this.name = name;
    }
}
