package pl_edu_spoj.Przedszkolanka;

import java.util.Scanner;

public class Przedszkolanka {
     Scanner scanner = new Scanner(System.in);
     private int a;
     private int b;

    public Przedszkolanka() {
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
    }

    public int nwd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return nwd(b, a%b);
        }
    }
    public int nww(){
        return ((a*b)/nwd(a,b));
    }

}
