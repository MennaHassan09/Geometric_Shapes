package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Project {

    public static void main(String[] args) {

        try {

            File inPut = new File("inPut.txt");
            Scanner scan = new Scanner(inPut);
            int n = scan.nextInt();
             n = Math.abs(n);
            Shape arr[] = new Shape[n];

            operation.inPut(arr);
            operation.outPut(arr);
            operation.print(arr);

        } catch (FileNotFoundException x) {
            System.err.println(x.getMessage());
        }

    }

}

