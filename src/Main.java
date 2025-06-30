import java.util.Scanner;
import Exception.InvalidParametersExceptions;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o número inicial");
        int num1 = sc.nextInt();
        System.out.println("Escolha o segundo número");
        int num2 = sc.nextInt();

        try{
            count(num1, num2);
        }catch (InvalidParametersExceptions ex){
            System.out.println(ex.getMessage());
        }
    }

    static void count(int num1, int num2) throws InvalidParametersExceptions {
        if(num2 <= num1){
            throw new InvalidParametersExceptions("O segundo número deve ser maior e diferente do primeiro número");
        }

        int count = num2 - num1;

        for(int i = 1; i < count + 1; i++){
            System.out.printf("\nImprimindo o número %s", i);
        }
    }
}
