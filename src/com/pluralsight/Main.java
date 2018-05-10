package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("test");
        for(String arg: args) {
            System.out.println("arg " + arg);
        }
        //streamTest();
        charTest();
    }

    public static void streamTest() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("inputTestFile.txt");
            out = new FileOutputStream("outputTestFile.txt");

            int length;
            while((length = in.read()) != -1){
                out.write(length);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }

    public static void charTest() throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("inputTestFile.txt");
            out = new FileWriter("outputTestFile.txt");

            int length;
            while((length = in.read()) != -1){
                char character = (char) length;
                int test = character;
                System.out.print("character" + character);
                out.write(length);
            }
        }finally {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }
}
