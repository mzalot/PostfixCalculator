/**
 * PostfixDriver
 * This is a driver for the postfix calculator class
 * Author: August Penny and Mareks Zeile
 * Collaborator(s):
 * Collaboration:
 * Date: 11/25/21
 **/
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;


public class PostfixDriver {
    public static void main(String[]args) throws IOException {

        //declares scanners and file names
        Scanner console=new Scanner(System.in);
        Scanner scFile;
        PostfixCalculator p = new PostfixCalculator();
        String inputFile;
        File file = new File("log.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);

        //gets the input file
        System.out.println("What is the name of the .txt file you would like to test the program with?");
        inputFile=console.nextLine();
        scFile = new Scanner(new File(inputFile));



        //loop that reads equation from file, evaluates it, and saves the result to a thrid log.txt file
        while(scFile.hasNextLine()){
            String inp= scFile.nextLine();
            String fin;

            p.setInput(inp);

            fin="Input: "+inp+"   | Result: "+p.evaluate()+"\n";
            writer.write(fin);


        }

        writer.flush();
        writer.close();
        System.out.println("Finished");




    }

}
