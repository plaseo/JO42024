package Week2;
import java.io.*;
import java.util.*;


public class ReadingAndWriting {
    public static void main(String[] args) {
        String fileName = "practice.csv";
        //BufferedWriter and Reader are able to read and write data in chunks, which is more efficient
        //The FileWriter and Reader can only read and write data one byte at a time, one line at a time
        try(BufferedWriter w1 = new BufferedWriter(new FileWriter(fileName))){
            //this is where the code you'd like to execute should go
            w1.write("First Name, Last Name, Employee ID");
            w1.newLine();
            w1.write("John, Wick, 1");
            w1.newLine();
            w1.write("Jason, Bourne, 2");
            w1.newLine();
            w1.write("Denzel, Washinton, 3");
            readFromExcelSheet("practice.csv");



        }catch(IOException e){
            e.printStackTrace();
            //code to handle any sort of issues in the try block
        }
    }
    public static void readFromExcelSheet(String fileName){
        try(Scanner input = new Scanner(new File(fileName))){
            System.out.println("Currently reading your file....");
            while(input.hasNextLine()){ 
                String line = input.nextLine();
                System.out.println(line);

            }
        }catch(IOException e){

        }
}
}
