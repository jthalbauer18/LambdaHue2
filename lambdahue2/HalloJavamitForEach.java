/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdahue2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonny
 */
public class HalloJavamitForEach {

    public static void main(String[] args) {
        String s = "";
        List<String> list = new ArrayList<>();
        list.add("Erste");
        list.add("Zweite");
        list.add("Dritte");

        for (String l : list) {
            System.out.println(l);
        }
    }
}
