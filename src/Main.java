import exceptions.InvalidParamException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o primeiro parâmetro: ");
        int p1 = sc.nextInt();
        System.out.print("digite o segundo parâmetro: ");
        int p2 = sc.nextInt();

        try{
            int occurrences = count(p1,p2);
            for (int i = 1; i <= occurrences; i++) {
                System.out.println("Imprimindo número " + i);
            }
        } catch (InvalidParamException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int count(int p1, int p2) throws InvalidParamException{
        if (p2 < p1) {
            throw new InvalidParamException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int amount = p2 - p1;
        return amount;
    }
}