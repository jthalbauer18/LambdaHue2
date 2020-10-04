/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdahue2;

import java.util.Scanner;

/**
 *
 * @author Jonny
 */
public class Main_Beispiel4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int erg = 0;

        do {
            System.out.println("Choose calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");

            erg = scn.nextInt();

            System.out.println("Enter number x a");
            int zahl1 = scn.nextInt();
            System.out.println("Enter number x b");
            int zahl2 = scn.nextInt();
            System.out.println("Enter number y a");
            int zahl3 = scn.nextInt();
            System.out.println("Enter number y b");
            int zahl4 = scn.nextInt();
            switch (erg) {
                case 1:
                    switch (operation()) {
                        case 1: Abstract Calcu
                    }
                    ;

            }
        } while (erg <= 3);
    }

    public static int operation() {
        Scanner scn = new Scanner(System.in);
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter Number again");
        int i = scn.nextInt();
        return i;
    }

}
