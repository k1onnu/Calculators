import java.util.Scanner;
public class Calculators {
    public static void main(String[] args) {
        System.out.println("\t*** Добро пожаловать в калькулятор суммы! ***\n");
        System.out.println("Введите первое число:");
        double oneSumm = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число:");
        double twoSumm = new Scanner(System.in).nextDouble();
        System.out.println(oneSumm + " + " + twoSumm + " = " + (oneSumm + twoSumm));
        System.out.println("\n");


        System.out.println("\t\t*** Добро пожаловать в калькулятор разности!***\n");
        System.out.println("Введите первое число:");
        double oneDiff = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число:");
        double twoDiff = new Scanner(System.in).nextDouble();
        System.out.println(oneDiff + " - " + twoDiff + " = " + (oneDiff - twoDiff));
        System.out.println("\n");


        System.out.println("\t\t***Добро пожаловать в калькулятор деления!***\n");
        System.out.println("Введите первое число:");
        double onePriv = new Scanner(System.in).nextDouble();
        System.out.println("ВВедите второе число:");
        double twoPriv = new Scanner(System.in).nextDouble();
        System.out.println(onePriv + " / " + twoPriv + " = " + (onePriv / twoPriv));
        System.out.println("\n");


        System.out.println("\t\t***Добро пожаловать в калькулятор умножения!***\n");
        System.out.println("Введите первое число:");
        double oneMult = new Scanner(System.in).nextDouble();
        System.out.println("Введите второе число:");
        double twoMult = new Scanner(System.in).nextDouble();
        System.out.println(onePriv + " * " + twoMult + " = " + (oneMult * twoMult));
    }
}