package pl.sages.dns.domain;

class Registrant {

    private String name;
    private String address;
    private String email;

    public Registrant(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
