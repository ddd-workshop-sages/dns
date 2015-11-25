package pl.sages.dns.domain;

import java.math.BigDecimal;

public class Zone {

    private String name;
    private BigDecimal standardRegistrationPrice;
    private ZoneHeaders headers;

    public Zone(String name, BigDecimal standardRegistrationPrice) {
        this.name = name;
        this.standardRegistrationPrice = standardRegistrationPrice;
    }

    public void updateHeader(String header, String value) {
        headers.updateHeader(header, value);
    }

    public void setStandardRegistrationPrice(BigDecimal standardRegistrationPrice) {
        this.standardRegistrationPrice = standardRegistrationPrice;
    }

    String getName() {
        return name;
    }
}
