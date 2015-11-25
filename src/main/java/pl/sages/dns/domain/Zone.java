package pl.sages.dns.domain;

import java.math.BigDecimal;

public class Zone {

    private String name;
    private ZoneHeaders headers;

    public Zone(String name) {
        this.name = name;
    }

    public void updateHeader(String header, String value) {
        headers.updateHeader(header, value);
    }
}