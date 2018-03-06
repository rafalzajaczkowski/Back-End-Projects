
public class Cat implements Userable {

    private String nickname;

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public void meow(){
        System.out.println("miau miau");
    }

    @Override
    public String getUsername() {
        return nickname;
    }
}

