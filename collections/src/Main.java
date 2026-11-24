import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> personagens = new ArrayList<>();

        personagens.add("Mario");
        personagens.add("Luigi");
        personagens.add("Peach");
        personagens.add("Yoshi");

        System.out.println(personagens.get(0));
        personagens.remove(2);




    }
}