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
        int erg;
        Number number = new Number();
        VectorCalculator vCalc = new VectorCalculator(((x, y) -> {

            double x1 = x.getA() + y.getA();
            double y1 = x.getB() + y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - y.getA();
            double y1 = x.getB() - y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), ((x, y) -> {

            double x1 = x.getA() * y.getA();
            double y1 = x.getB() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), (x, y) -> {

            double x1 = x.getA() / y.getA();
            double y1 = x.getB() / y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        });

        ComplexCalculator cCalc = new ComplexCalculator(((x, y) -> {

            double x1 = x.getA() + x.getB();
            double y1 = y.getA() + x.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - x.getB();
            double y1 = y.getA() - y.getB();
            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), ((x, y) -> {

            double x1 = x.getA() * x.getB() - y.getA() * y.getB();
            double y1 = x.getA() * y.getB() + x.getB() * y.getA();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), (x, y) -> {

            double x1 = x.getA() * x.getB() + y.getA() * y.getB();
            double y1 = x.getA() * y.getB() - x.getB() * y.getA();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        });

        RationalCalculator rCalc = new RationalCalculator(((x, y) -> {

            double x1 = x.getA() + x.getB();
            double y1 = y.getA() + y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - x.getB();
            double y1 = y.getA() - y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), ((x, y) -> {

            double x1 = x.getA() * x.getB();
            double y1 = y.getA() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), (x, y) -> {

            double x1 = x.getA() - x.getB();
            double y1 = y.getA() - y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }
        );

        do {
            System.out.println("Choose calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");
            Number n1 = new Number();
            Number n2 = new Number();
            erg = scn.nextInt();

            System.out.println("Enter number x a");
            double xa = scn.nextDouble();
            System.out.println("Enter number x b");
            double xb = scn.nextDouble();
            System.out.println("Enter number y a");
            double ya = scn.nextDouble();
            System.out.println("Enter number y b");
            double yb = scn.nextDouble();
            n1.setA(xa);
            n1.setB(xb);
            n2.setA(ya);
            n2.setB(yb);
            switch (erg) {
                case 1:
                    switch (operation()) {
                        case 1:
                            rCalc.add(n1, n2);
                            break;
                        case 2:
                            rCalc.subtract(n1, n2);
                            break;
                        case 3:
                            rCalc.multiply(n1, n2);
                            break;
                        case 4:
                            rCalc.divide(n1, n2);
                            break;
                    }
                case 2:
                    switch (operation()) {
                        case 1:
                            vCalc.add(n1, n2);
                            break;
                        case 2:
                            vCalc.subtract(n1, n2);
                            break;
                        case 3:
                            vCalc.multiply(n1, n2);
                            break;
                        case 4:
                            vCalc.divide(n1, n2);
                            break;
                    }
                case 3:
                    switch (operation()) {
                        case 1:
                            cCalc.add(n1, n2);
                            break;
                        case 2:
                            cCalc.subtract(n1, n2);
                            break;
                        case 3:
                            cCalc.multiply(n1, n2);
                            break;
                        case 4:
                            cCalc.divide(n1, n2);
                            break;
                    }

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
