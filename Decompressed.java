package LZW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Leila Sa3eed
 */

public class Decompressed {
    public void decomp (int n) throws FileNotFoundException, IOException{
        BufferedReader reader = new BufferedReader(new FileReader("AZ.txt"));
        String line = "";
        int f = 0 , count = 0;
        String search = "";
        String temp = "";
        String word = "";
        for (int i = 0 ; i < n ; i++){
            Scanner in = new Scanner(System.in);
            int b = in.nextInt();
            while ( reader.readLine() != null){
                line = reader.readLine();
                if (b == count){
                    f = 1;
                    break;
                }
                count ++;
            }
            if (f == 1){
                temp = word ; 
                word = line ;
                temp += word.charAt(0);
            }
            else {
                temp = word + word.charAt(0);
            }
            PrintWriter writer = new PrintWriter("AZ.txt", "UTF-8");
            writer.println(temp);
            System.out.print(word);
        }
    }
    
}
