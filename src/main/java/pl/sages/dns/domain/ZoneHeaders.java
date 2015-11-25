package pl.sages.dns.domain;

import java.util.HashMap;
import java.util.Map;

class ZoneHeaders {

    private Map<String, String> headers = new HashMap<String, String>();

    void updateHeader(String header, String value) {
        headers.put(header, value);
    }
}
