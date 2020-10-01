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

            int r;
            int sum = 0; 
            int temp;

            temp = x;
            while (x > 0) {
                r = x % 10;  
                sum = (sum * 10) + r;
                x = x / 10;
            }
            return temp == sum;
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

        System.out.println(numberTester.palindromeTester.testNumber(121));
    }
}
