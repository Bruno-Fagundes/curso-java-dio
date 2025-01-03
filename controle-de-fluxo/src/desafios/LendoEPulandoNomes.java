package desafios;

import java.util.Scanner;

public class LendoEPulandoNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] faculdades = new String[10];

        for (int i = 0; i < 10; i++) {
            faculdades[i] = scanner.next();
            //if (i == 3 || i == 7 || i == 9){
            //    System.out.println(faculdades[i]);
            //}
        }
        System.out.println(faculdades[2] +  "\n" + faculdades[6] +  "\n" + faculdades[8]);
    }
}
