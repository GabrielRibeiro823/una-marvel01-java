
import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do recruta: ");
        String nome = sc.nextLine().toUpperCase();
        System.out.println("ola "+nome+"!");
        
        System.out.println("digite o seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("seu peso é: "+peso+" Kg");

        if (peso < 50) {
            System.out.println("Voce esta abaixo do peso ideal para o alistamento.");
        } else if (peso >= 50 && peso <= 100) {
            System.out.println("Voce esta dentro do peso ideal para o alistamento.");
        } else {
            System.out.println("Voce esta acima do peso ideal para o alistamento.");
        }

        sc.close();

        
    }
}
