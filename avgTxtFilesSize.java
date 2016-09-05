package JavaIO;

/**
 * Created by Roberto on 0002, 02 септември.
 */

import java.io.*;
import java.util.Scanner;

public class avgTxtFilesSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        sc.close();

        File file = new File(path);

        if(!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        double size = 0;
        int filesNumber = 0;

        for(File f : file.listFiles()) {
            if(f.getName().endsWith(".txt")) {
                size += f.length();
                ++filesNumber;
            }
        }

        if(filesNumber == 0) {
            System.out.println("No such files!");
            return;
        }

        System.out.println(size / filesNumber);
    }
}