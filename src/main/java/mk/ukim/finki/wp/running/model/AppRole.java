package mk.ukim.finki.wp.running.model;

public enum AppRole {
    ADMIN, PROFESSOR, STUDENT, GUEST;

    public String roleName() {
        return "ROLE_" + this.name();
    }
}
