import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import java.util.Scanner;


public class Main {
    public static void fazerSonsDeAnimais(Animal animal) {
        animal.falar();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Animal animal;
        String entrada = teclado.nextLine().trim();

        if (entrada.equals("cachorro")) {
            animal = new Cachorro();
        } else if (entrada.equals("gato")) {
            animal = new Gato();
        } else {
            animal = new Animal();
        }

        fazerSonsDeAnimais(animal);

        teclado.close();
    }
}
