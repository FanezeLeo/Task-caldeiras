import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Maps {
    public static void main(String[] args) {
        Random random = new Random();

        Map<String,  Integer> alunos = new HashMap<>();

        alunos.put("Luan", random.nextInt(6));
        alunos.put("Mirelly", random.nextInt(6));
        alunos.put("Rafael", random.nextInt(6));
        alunos.put("Rayssa", random.nextInt(6));
        alunos.put("Jean", random.nextInt(6));


        for(Map.Entry<String, Integer> e: alunos.entrySet()){
            System.out.println(e.getKey() + " - Nota: " + e.getValue());
        }
    }
}
