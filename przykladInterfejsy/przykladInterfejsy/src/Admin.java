public class Admin extends User {



    public Admin(String username, String email, String[] roles) {
        super(username,email);
        this.roles = roles;
    }

    public Admin(String username, String email){
        super(username,email);
    }


    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    private String[] roles;



}
