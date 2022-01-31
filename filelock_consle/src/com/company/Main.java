package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main{
    public static String quoteremover(String input){
        String send = "";
        char look = '"';
        if (input.charAt(0) == look){
            int inputlen = input.length();
            int gg = inputlen -1;
            for (int ind = 1; ind < gg; ind++){
                send = send + input.charAt(ind);
            }
        }else {
            return input;
        }
        return send;
    }
    public static void main(String[] args) {
        functionclass sender = new functionclass();
    File targetfile;
    int onoff; //0= encrypt file, 1= decrypt file
    String passphrase; // 3 digits
    Scanner input = new Scanner(System.in);
        System.out.println("Enter target location:");
        String targetinput = input.nextLine();
        String targetstring = quoteremover(targetinput);
        targetfile = new File(targetstring);
        if (targetfile.exists() == false){
            System.out.println("location not found");
            int crash = 8/0;
        }
        System.out.println("Encrypt: 0    Decrypt: 1");
        onoff = Integer.parseInt(input.nextLine());
        if (onoff != 0 && onoff != 1){
            System.out.println("incorrect input");
            int crash = 8/0;
        }
        System.out.println("Enter 5 digit key:");
        passphrase = input.nextLine();
        if (passphrase.length() != 5){
            System.out.println("key must be 3 numbers long");
            int crash = 8/0;
        }
        String retunn = sender.classhandler(targetfile, passphrase, onoff);
        if (retunn == "good"){
            if (onoff == 1){
                System.out.println("all files decrypted, exiting");
            }if (onoff == 0){
                System.out.println("all files encrypted, exiting");
            }
        }if (retunn == "error"){
            System.out.println("Lost connection to target files!");
        }if (retunn == "security"){
            secuityclass securityclass = new secuityclass();
            securityclass.classrun();
            System.out.println("Security Override!");
        }if (retunn == "secwarn"){
            System.out.println("Secuirty Warning!");
        }if (retunn == "Override"){
            System.out.println("Secuirty override in effect, filelock suspended!");
        } if ( retunn == "pin"){
            System.out.println("Invalid PIN");
        }if (retunn == "unreachable"){
            System.out.println("Critical Failure!");
        }

    }
}