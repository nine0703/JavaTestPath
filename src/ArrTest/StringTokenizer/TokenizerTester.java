package Made_in_Fri_Mar.StringTokenizer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TokenizerTester {
    public static void main(String[] args) throws IOException {
        String filePath = "src/Made_in_Fri_Mar/resources/file";
        File f = new File(filePath);

        FileReader frd = new FileReader(filePath);
        BufferedReader bfr = new BufferedReader(frd);
        int leng;
        while((leng = bfr.read()) != -1){
            char ch = (char) leng;
            System.out.print(ch);

        }


    }   //  method main end.

}   // class end.
