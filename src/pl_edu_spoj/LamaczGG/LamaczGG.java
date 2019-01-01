//https://pl.spoj.com/problems/JGGHACK/

package pl_edu_spoj.LamaczGG;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LamaczGG {

    private char[] possibleLettersTab = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
    private int[] valuesOfFirstLetter = {0, 1, 2, 3, 4, 5 ,6 ,7 , 8, 9, 10, 11, 12, 13, 14, 15};
    private int[] valuesOfSecondLetter = {0, 16, 32, 48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240};

    public String crackPasword(){
        Scanner scanner = new Scanner(System.in);
        char[] encodedPassword = scanner.next().toCharArray();
        String decodedPassword = "";
        int tempFirst = 0;
        int tempSecond = 0;
        for(int i = 1; i < encodedPassword.length; i += 2){
            for(int j = 1; j < possibleLettersTab.length; j++){
                if(encodedPassword[i - 1] == possibleLettersTab[j]){
                    tempFirst = j;
                }
                if(encodedPassword[i] == possibleLettersTab[j]){
                    tempSecond = j;
                }
            }
            decodedPassword += (char)(valuesOfFirstLetter[tempFirst] + valuesOfSecondLetter[tempSecond]);
        }
        return decodedPassword;
    }
}