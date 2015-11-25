package pl.sages.dns.registrar;

public class Registrar {

    private RegistrarId id;
    private String name;
    private String address;
    private String email;

    public class RegistrarId {
        private String id;

        public String getId() {
            return id;
        }
    }
}
