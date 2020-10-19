/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdahue2;

import java.io.FileNotFoundException;

/**
 *
 * @author Jonny
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        NumberTester numberTester = new NumberTester("TestData.txt");
        numberTester.setOddEvenTester(x -> {
            return x % 2 == 0;
        });
        numberTester.setPalindromeTester(x -> {
            boolean tf = false;

            String s = Integer.toString(x);
            int g = s.length() - 1;
            int[] a = new int[g];
            int[] b = new int[g];
            int j = g;
            if (g == 0) {
                return true;
            }
            for (int i = 0; i < g; i++) {
                a[i] = s.charAt(i);
                b[i] = s.charAt(j);
                j--;
            }
            for (int i = 0; i < g && !tf; i++) {
                if (a[i] == b[i]) {
                    tf = true;
                } else {
                    tf = false;
                    i = 10;
                }
            }

            return tf;
        });

        numberTester.setPrimeTester(x -> {
            if (x == 1) {
                return false;
            } else {
                for (int i = 2; i <= Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        });
        numberTester.testFile();

    }
}
