package com.stackroute.javakeywords.inputoutputstream;

import java.io.FileOutputStream;

public class FileOutPutStreamDEmo {
    public static void main(String args[]) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/home/cgi/Music/Test.txt");
            String string = "Samaresh Maiti";
            //converting string into byte array
            byte b[] = string.getBytes();
            //put the input into the file
            fileOutputStream.write(b);
            fileOutputStream.close();
            System.out.println("File created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
