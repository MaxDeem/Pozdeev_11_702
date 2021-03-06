package ru.itis;

import java.io.FileInputStream;
import java.io.IOException;

public class MyScanner {
    private FileInputStream input;

    public MyScanner(String name){
        try {
            input = new FileInputStream(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String nextLine() throws Exception{
        byte bytes[] = new byte[100];
        input.read(bytes);
        String line = "";
        for (int i = 0; i < bytes.length; i++){
            line += (char) bytes[i];
        }
        return line;
    }

    public int nextInt() throws Exception{
        byte bytes[] = new byte[100];
        input.read(bytes);
        int number = 0;
        int pow = 1;
        int check = 0;
        for (int i = bytes.length - 1; i >= 0; i--){
            if ((char) bytes[i] - '0' >= 0 && (char) bytes[i] - '0' <=9) {
                number += ((char) bytes[i] - '0') * pow;
                pow *= 10;
            } else{
                check = (bytes[i] != 0 && (char) bytes[i] != '-') ? 1 : check;
            }
        }
        number = ((char) bytes[0] == '-') ? (number == 0) ? number : -number : number;
        return number;
    }
}
