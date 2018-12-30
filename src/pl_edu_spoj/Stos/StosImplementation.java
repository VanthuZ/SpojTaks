//https://pl.spoj.com/problems/STOS/

package pl_edu_spoj.Stos;

import java.util.Scanner;

public class StosImplementation {
    static Scanner scanner = new Scanner(System.in);
    private int[] tab;
    private int counter = 0;

    public StosImplementation() {
        this.tab = new int[10];
    }

    public void push(){
        int value = Integer.parseInt(scanner.nextLine());
        tab[counter] = value;
        counter++;
        System.out.println(":)");
    }

    public void pop(){
        System.out.println(tab[counter-1]);
        counter--;
    }

    public void show(){
        for(Integer e: tab){
            System.out.println(e);
        }
    }

    public static void runStos(){
        Scanner scannerStos = new Scanner(System.in);
        StosImplementation stos = new StosImplementation();
        char choice;
        while(scannerStos.hasNextLine()){
            choice = scannerStos.next().charAt(0);
            if(choice == '+'){
                try {
                    stos.push();
                }catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(":(");
                }
            }
            if(choice == '-'){
                try {
                    stos.pop();
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println(":(");
                }
            }
        }
    }
}
