import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Object> conjunto3 = new ArrayList<>();
        ArrayList<Object> conjunto4 = new ArrayList<>();

        for (int i = 9; i >= 0; i--) {
            conjunto3.add(i);
        }

        for (int i = 0; i < 10; i++) {
            conjunto4.add(i);
        }


        ArrayList<Object> conjunto1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            conjunto1.add(i);
        }

        conjunto1.add(conjunto3);


        Conjunto<Object> teste = new Conjunto<>(conjunto1);


        ArrayList<Object> conjunto2 = new ArrayList<>();

        for (int i = 5; i < 15 ; i++) {
            conjunto2.add(i);
        }

        conjunto2.add(conjunto4);


        Conjunto<Object> teste2 = new Conjunto<>(conjunto2);
        System.err.println(teste.interseccao(teste2).equals(conjunto2));



    }
}
