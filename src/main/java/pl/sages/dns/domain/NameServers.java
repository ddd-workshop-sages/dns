package pl.sages.dns.domain;

import java.util.List;

class NameServers {

    private List<String> hostnames;

    public NameServers(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    public boolean areValid() {
        return true;
    }
}
