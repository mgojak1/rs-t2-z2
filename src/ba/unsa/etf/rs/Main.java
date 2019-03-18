package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = s.nextInt();
        for (int i = 1; i < n;i++){
            int suma = 0;
            int temp = i;
            while (temp != 0){
                suma = suma + (temp%10);
                temp = temp/10;
            }
            if(i % suma == 0) System.out.println(i);
        }
    }
}
