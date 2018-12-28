package pl_edu_spoj;

import java.util.Scanner;

public class StringMerge {

    private static char[] a = new char[0];
    private static char[] b = new char[0];

    public static void string_merge(){
        Scanner scanner = new Scanner(System.in);
        int t; //test number
        t = Integer.parseInt(scanner.nextLine());

        int size;
        for (int i = 0; i < t; i++) {
            a = scanner.nextLine().toCharArray();
            b = scanner.nextLine().toCharArray();
            if(a.length == 1 || b.length == 1){
                size = 2;
            }else if(a.length > b.length){
                size = b.length * 2;
            }else{
                size = a.length * 2;
            }
            char[] c = new char[size];

            int tempA = 0;
            int tempB = 0;
            int tempC = 0;
            while(tempC < size){
                if(tempC % 2 == 0){
                    c[tempC] = a[tempA];
                    tempA++;
                }else{
                    c[tempC] = b[tempB];
                    tempB++;
                }
                tempC++;
            }
            System.out.println(c);
        }

    }
}
