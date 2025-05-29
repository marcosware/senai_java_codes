package File_Buffered;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("/source.csv");
        try {
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String line = br.readLine();
            while(line != null) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
