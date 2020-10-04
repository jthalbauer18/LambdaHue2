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
 * Beispiel 2
 */
public class HalloJavamitForEach {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Erste");
        list.add("Zweite");
        list.add("Dritte");

        list.forEach((l) -> {
            System.out.println(l);
        });
        
        list.forEach((String s)-> System.out.println(s));
        
        list.forEach(System.out::println);
    }
}
