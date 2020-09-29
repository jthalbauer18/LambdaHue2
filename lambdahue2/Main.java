/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdahue2;

/**
 *
 * @author Jonny
 */
public class Main {

    public static void main(String[] args) {
        NumberTester numberTester = new NumberTester("TestData.txt");
        numberTester.setOddEvenTester(x -> {
            return x % 2 == 0;
        });
        numberTester.setPalindromeTester(x -> {
            int[] palinList = new int[x];
            int[] palinListRev = new int[x];
            for (int i = 0; i < x; i++) {

                palinList[i] = Integer.toString(x).charAt(i);

            }
            for (int i = 0; i < x; i++) {

                palinListRev[x - 1] = Integer.toString(x).charAt(i);
            }

            return palinList.equals(palinListRev);

        });
        numberTester.setPrimeTester(x -> {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    return false;
                }
            }

            return true;
        });
    }
}
