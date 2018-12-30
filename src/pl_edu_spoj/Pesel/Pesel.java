// https://pl.spoj.com/problems/JPESEL/

package pl_edu_spoj.Pesel;
import java.util.Scanner;

public class Pesel {

    private static Scanner scanner = new Scanner(System.in);

    public static void peselValidate() {

        int k;
        k = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < k; j++) {
            int[] tabPesel = new int[11];
            char[] tabPeselChar;
            int sumNumberPesl;
            tabPeselChar = scanner.nextLine().toCharArray();

            for(int i = 0; i < tabPeselChar.length; i++) {
                tabPesel[i] = (int) tabPeselChar[i];
            }

            sumNumberPesl = tabPesel[0] * 1 + tabPesel[1] * 3 + tabPesel[2] * 7 + tabPesel[3] * 9 + tabPesel[4] * 1 +
                    tabPesel[5] * 3 + tabPesel[6] * 7 + tabPesel[7] * 9 + tabPesel[8] * 1 + tabPesel[9] * 3 + tabPesel[10];

            if (sumNumberPesl % 10 == 0) {
                System.out.println("D");
            }else {
                System.out.println("N");
            }
        }
    }
}
