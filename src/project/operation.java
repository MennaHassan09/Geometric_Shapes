package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class operation {

    public static void outPut(Shape arr[]) {
        try {
            File outPut = new File("sumAreas.txt");

            PrintWriter writer = new PrintWriter(outPut);
            for (int i = 0; i < arr.length; i++) {

                writer.println(arr[i].getArea());
            }
            writer.close();
        } catch (FileNotFoundException x) {
            System.err.println(x.getMessage());
        }

    }

    public static void inPut(Shape arr[]) {
        try {
            File inPut = new File("inPut.txt");

            Scanner scan = new Scanner(inPut);

            int n = scan.nextInt();
            n = Math.abs(n);
            for (int i = 0; i < n; i++) {

                String name = scan.next();
                double size = scan.nextDouble();

                if (name.equals("circle")) {
                    arr[i] = new Circle(size);
                } else if (name.equals("cube")) {
                    arr[i] = new Cube(size);
                }
            }
            scan.close();
        } catch (FileNotFoundException x) {
            System.err.println(x.getMessage());
        }
    }

    public static void print(Shape arr[]) {

        for (int i = 0; i < arr.length; i++) {
            Art2 art = new Art2("Shape " + (i + 1));
            Drawer2 d = new Drawer2(arr[i]);
            art.add(d);
            art.setVisible(true);
        }

    }
}
