package misc;

import java.util.*;
import java.io.*;

public class Test {

    private static ArrayList<String> carbrands;

    public Test(){
    }

    public void addCarBrand(String brand) {
        carbrands.add(brand);
    }

    public static void printAll() {
        carbrands.add("BMW");
        carbrands.add("Audi");
        carbrands.add("Ford");
        carbrands.add("Mercedes");

        Iterator it = carbrands.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
            System.out.println();
        }
    }
    public static void main (String[] args) {
        printAll();
    }
}

