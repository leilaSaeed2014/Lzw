package LZW;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Vector;

public class Compressed {
    PrintWriter writer;
    public Compressed() throws FileNotFoundException, UnsupportedEncodingException{
        this.writer = new PrintWriter("AZ.txt", "UTF-8");
        for(int i = 0 ; i < 128 ; i++){
            writer.println(String.valueOf((char)i));
        }
        writer.close();
    }
    public void comp (String S) throws FileNotFoundException, IOException{

        int temp = 0;
        int f = 0;
        BufferedReader reader = new BufferedReader(new FileReader("AZ.txt"));       
        for (int i = 0 ; i <S.length() ; i++ ){
            String str = "\0";
            for (int j = i ; j < S.length() ; j++){
                str += S.charAt(i);
                String line = null;
                int count = 0;
                while (reader.readLine() != null && f != 1){
                    line = reader.readLine();
                    count ++ ;
                    if (line == str)
                        f = 1;
                }
                if (f == 1){
                    temp = count;
                    
                }
                else {
                	writer.println(str);
                    i = j;
                    break;
                }
            }
            System.out.print("< ");
            System.out.print(temp);
            System.out.print(" >");
        }
    }
}