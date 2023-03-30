package Models;

public class Admin extends Person {
    public Admin() {
        this.name = "";
        this.email = "";
    }

    public Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
