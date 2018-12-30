//https://pl.spoj.com/problems/JZLICZ/

package pl_edu_spoj.ZliczaczLiter;

import java.util.*;

public class ZliczaczLiter {

    static Scanner scanner = new Scanner(System.in);
    private static char[] tabChar = scanner.nextLine().toCharArray();
    private static TreeMap<Character, Integer> charSet = new TreeMap<>();

   public static void countLetters(){

       for (int i = 0; i < tabChar.length; i++) {
           int count = 0;
           for (int j = 0; j < tabChar.length; j++) {
               if(tabChar[i] == tabChar[j]){
                   count++;
               }
           }
           if(tabChar[i] != ' ') {
               charSet.put(tabChar[i], count);
           }
          String test = Character.toString(tabChar[2]);
       }
   }

   public static void showResults(){
       for(Map.Entry<Character, Integer> entry: charSet.entrySet()){
           Character key = entry.getKey();
           Integer value = entry.getValue();

           System.out.println(key + " " + value);
       }
   }

}


