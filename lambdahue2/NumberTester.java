/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdahue2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jonny
 */
public class NumberTester {

    public interface NumberTest {

        boolean testNumber(int number);
    }
    String fileName;
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    Scanner sc = null;

    public NumberTester(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        this.sc = new Scanner(file);
    }

    public NumberTest getOddTester() {
        return oddTester;
    }

    public NumberTest getPrimeTester() {
        return primeTester;
    }

    public NumberTest getPalindromeTester() {
        return palindromeTester;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        int testerNumber;
        int testNumber;
        int zeilen = Integer.parseInt(this.sc.nextLine());
        for (int i = 0; i < zeilen; i++) {
            String[] deserialize = (this.sc.nextLine().split(" "));
            testerNumber = Integer.parseInt(deserialize[0]);
            testNumber = Integer.parseInt(deserialize[1]);
            if (0 < testerNumber && testerNumber < 4) {
                switch (testerNumber) {
                    case 1:
                        System.out.println(testNumber + " ist Gerade  = " + oddTester.testNumber(testNumber));
                        break;
                    case 2:
                        System.out.println(testNumber + " ist Primzahl = " + primeTester.testNumber(testNumber));
                        break;
                    case 3:
                        System.out.println(testNumber + " ist Palindrome = " + palindromeTester.testNumber(testNumber));
                        break;

                }
            }

        }
        this.sc.close();
    }
}
