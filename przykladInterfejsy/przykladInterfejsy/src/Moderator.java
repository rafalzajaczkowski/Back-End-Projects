
public class Moderator extends User {

    public Moderator(String username, String email) {
        super(username, email);
    }

    public void moderate(){
        System.out.println("Moderuje");
    }
}
