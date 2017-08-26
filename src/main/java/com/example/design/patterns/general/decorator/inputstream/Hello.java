package com.example.design.patterns.general.decorator.inputstream;

import java.io.*;

public class Hello {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream("ASDASD".getBytes())));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
