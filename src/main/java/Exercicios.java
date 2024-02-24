import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valorUsuario = sc.nextInt();

        Random aleatorioSemSeed = new Random();
        int valorAleatorioSemSeed = aleatorioSemSeed.nextInt(100);

        Random aleatorioComSeed = new Random(123);
        int valorAleatorioComSeed = aleatorioComSeed.nextInt();

        int somaSemSeed = valorUsuario + valorAleatorioSemSeed;
        int somaComSeed = valorUsuario + valorAleatorioComSeed;

        System.out.println("Esse é o seu número aleatorio sem seed: " + somaSemSeed);
        System.out.println("Esse é o seu número aleatorio com seed: " + somaComSeed);
    }
}