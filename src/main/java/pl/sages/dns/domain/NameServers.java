package pl.sages.dns.domain;

import java.util.List;

class NameServers {

    private List<String> hostnames; //TODO: NameServer instead of Strings

    public NameServers(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    public boolean areValidNameServers() {
        return true;
    }
}
