package pl_edu_spoj.Suma;

import java.util.Scanner;

public class Suma {
    static Scanner scanner = new Scanner(System.in);
    private static int howMuchNumbers = scanner.nextInt();
    private static int[] numbers = new int[howMuchNumbers];
    private static int sum = 0;

    public static void readData(){
        for(int i = 0; i < howMuchNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public static void showResult(){
        for(int i = 0; i < howMuchNumbers; i++){
            sum += numbers[i];
            System.out.println(sum);
        }
    }



}

