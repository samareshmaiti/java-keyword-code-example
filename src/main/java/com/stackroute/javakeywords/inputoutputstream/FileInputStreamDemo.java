package com.stackroute.javakeywords.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//this is the implementation of the FileInputStream class that takes input as file location
//and print the content of the file
public class FileInputStreamDemo {
    public static void main(String args[]) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/cgi/Music/Test.txt");
            FileOutputStream fileOutputStream=new FileOutputStream("/home/cgi/Music/Test.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            int j;
            while((j=fileInputStream.read())!=-1)
            {
                fileOutputStream.write((byte)j);
            }

            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
