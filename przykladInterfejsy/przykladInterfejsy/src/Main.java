import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin("michalos", "aaa@gmail.com");
        Admin admin2 = new Admin("michalos2", "aaa@gmail.com");

        RegularUser regularUser = new RegularUser("dsa", "dsadsa@gmail.com");
        RegularUser regularUser1 = new RegularUser("dsa", "das@gmail.com");

        Moderator moderator = new Moderator("das2", "21@gmail.com");
        Moderator moderator2 = new Moderator("das24", "25@gmail.com");

        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(admin2);

        users.add(regularUser);
        users.add(regularUser1);

        users.add(moderator);
        users.add(moderator2);

        for (User user : users) {
            System.out.println(user.getUsername());
        }

        // Jeśli mamy Liste obiektów typu interfejs
        // to Sprawdzene jest czy obiekt należy do klasy, która implementuje dany interfejs
        List<Userable> userableList = new ArrayList<>();
        userableList.add(admin);
        userableList.add(admin2);

        userableList.add(regularUser);
        userableList.add(regularUser1);

        userableList.add(moderator);
        userableList.add(moderator2);

        userableList.add(new Cat("siri"));

        for (Userable user : userableList) {
            System.out.println(user.getUsername());
        }




    }
}
