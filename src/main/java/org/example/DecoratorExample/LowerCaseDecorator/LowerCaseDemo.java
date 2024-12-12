package org.example.DecoratorExample.LowerCaseDecorator;

import java.io.*;

public class LowerCaseDemo {
    public static void main(String[] args) throws IOException {
       InputStream reader = new LowerCaseInputReader(new BufferedInputStream(new FileInputStream("text.txt")));
       StringBuilder resultString = new StringBuilder();

       int c;
       while((c = reader.read()) >= 0){
           resultString.append((char) c);
       }

        System.out.println(resultString);
       reader.close();
    }
}
