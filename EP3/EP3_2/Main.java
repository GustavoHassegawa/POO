import animais.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        String entry = "";
        Scanner teclado = new Scanner(System.in);

        while (!entry.equals("fim")) {
            entry = teclado.nextLine().trim().toLowerCase();
            if (entry.equals("cachorro")) {
                animais.add(new Cachorro());
            } else if (entry.equals("gato")) {
                animais.add(new Gato());
            } else if (entry.equals("animal")) {
                animais.add(new Animal());
            }
        }

        for (Animal a : animais) {
            a.falar();
        }
    }
}
