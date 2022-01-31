package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class functionclass {
    private static void hozinv2(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv2(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/2;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*2;
                    int byte2loc = kk*2 +1;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    dataarray[byte1loc] = byte2;
                    dataarray[byte2loc] = byte1;
                    kk = kk +1;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void hozinv3(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv3(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/3;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*3;
                    int byte2loc = kk*3 +1;
                    int byte3loc = kk*3 +2;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    dataarray[byte1loc] = byte3;
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte1;
                    kk = kk + 2;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void hozinv4(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv4(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/4;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*4;
                    int byte2loc = kk*4 +1;
                    int byte3loc = kk*4 +2;
                    int byte4loc = kk*4 +3;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    dataarray[byte1loc] = byte4;
                    dataarray[byte2loc] = byte3;
                    dataarray[byte3loc] = byte2;
                    dataarray[byte4loc] = byte1;
                    kk = kk + 3;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void hozinv5(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv5(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/5;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*5;
                    int byte2loc = kk*5 +1;
                    int byte3loc = kk*5 +2;
                    int byte4loc = kk*5 +3;
                    int byte5loc = kk*5 +4;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    dataarray[byte1loc] = byte5;
                    dataarray[byte2loc] = byte4;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = byte2;
                    dataarray[byte5loc] = byte1;
                    kk = kk +4;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void hozinv6(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv6(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/6;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*6;
                    int byte2loc = kk*6 +1;
                    int byte3loc = kk*6 +2;
                    int byte4loc = kk*6 +3;
                    int byte5loc = kk*6 +4;
                    int byte6loc = kk*6 +5;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    dataarray[byte1loc] = byte6;
                    dataarray[byte2loc] = byte5;
                    dataarray[byte3loc] = byte4;
                    dataarray[byte4loc] = byte3;
                    dataarray[byte5loc] = byte2;
                    dataarray[byte6loc] = byte1;
                    kk = kk +5;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void hozinv7(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv7(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/7;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*7;
                    int byte2loc = kk*7 +1;
                    int byte3loc = kk*7 +2;
                    int byte4loc = kk*7 +3;
                    int byte5loc = kk*7 +4;
                    int byte6loc = kk*7 +5;
                    int byte7loc = kk*7 +6;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    dataarray[byte1loc] = byte7;
                    dataarray[byte2loc] = byte6;
                    dataarray[byte3loc] = byte5;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = byte3;
                    dataarray[byte6loc] = byte2;
                    dataarray[byte7loc] = byte1;
                    kk = kk +6;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void hozinv8(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv8(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/8;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*8;
                    int byte2loc = kk*8 +1;
                    int byte3loc = kk*8 +2;
                    int byte4loc = kk*8 +3;
                    int byte5loc = kk*8 +4;
                    int byte6loc = kk*8 +5;
                    int byte7loc = kk*8 +6;
                    int byte8loc = kk*8 +7;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    dataarray[byte1loc] = byte8;
                    dataarray[byte2loc] = byte7;
                    dataarray[byte3loc] = byte6;
                    dataarray[byte4loc] = byte5;
                    dataarray[byte5loc] = byte4;
                    dataarray[byte6loc] = byte3;
                    dataarray[byte7loc] = byte2;
                    dataarray[byte8loc] = byte1;
                    kk = kk +7;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void hozinv9(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                hozinv9(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }
        if (target.isFile()){
            byte[] dataarray =null ;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/9;
            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*9;
                    int byte2loc = kk*9 +1;
                    int byte3loc = kk*9 +2;
                    int byte4loc = kk*9 +3;
                    int byte5loc = kk*9 +4;
                    int byte6loc = kk*9 +5;
                    int byte7loc = kk*9 +6;
                    int byte8loc = kk*9 +7;
                    int byte9loc = kk*9 +8;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    dataarray[byte1loc] = byte9;
                    dataarray[byte2loc] = byte8;
                    dataarray[byte3loc] = byte7;
                    dataarray[byte4loc] = byte6;
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = byte4;
                    dataarray[byte7loc] = byte3;
                    dataarray[byte8loc] = byte2;
                    dataarray[byte9loc] = byte1;
                    kk = kk +8;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }
            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
                //logwriter("file encrypted");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        } //end logic
    }
    private static void neginv0(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv0(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = (byte) (Integer.parseInt(String.valueOf(byte1)) * -1);
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = (byte) (Integer.parseInt(String.valueOf(byte5)) * -1);
                    dataarray[byte6loc] = (byte) (Integer.parseInt(String.valueOf(byte6)) * -1);
                    dataarray[byte7loc] = (byte) (Integer.parseInt(String.valueOf(byte7)) * -1);
                    dataarray[byte8loc] = (byte) (Integer.parseInt(String.valueOf(byte8)) * -1);
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = (byte) (Integer.parseInt(String.valueOf(byte10)) * -1);
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv1(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv1(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = byte1;
                    dataarray[byte2loc] = (byte) (Integer.parseInt(String.valueOf(byte2)) * -1);
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = (byte) (Integer.parseInt(String.valueOf(byte4)) * -1);
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = (byte) (Integer.parseInt(String.valueOf(byte6)) * -1);
                    dataarray[byte7loc] = (byte) (Integer.parseInt(String.valueOf(byte7)) * -1);
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = (byte) (Integer.parseInt(String.valueOf(byte10)) * -1);
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv2(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv2(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = (byte) (Integer.parseInt(String.valueOf(byte1)) *-1);
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = (byte) (Integer.parseInt(String.valueOf(byte5))*-1);
                    dataarray[byte6loc] = (byte) (Integer.parseInt(String.valueOf(byte6))*-1);
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = (byte) (Integer.parseInt(String.valueOf(byte8))*-1);
                    dataarray[byte9loc] = (byte) (Integer.parseInt(String.valueOf(byte9))*-1);
                    dataarray[byte10loc] = (byte) (Integer.parseInt(String.valueOf(byte10))*-1);
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv3(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv3(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = (byte) (Integer.parseInt(String.valueOf(byte1)) *-1);
                    dataarray[byte2loc] = (byte) (Integer.parseInt(String.valueOf(byte2)) *-1);
                    dataarray[byte3loc] = (byte) (Integer.parseInt(String.valueOf(byte3)) *-1);
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = byte6;
                    dataarray[byte7loc] = (byte) (Integer.parseInt(String.valueOf(byte7)) *-1);
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = (byte) (Integer.parseInt(String.valueOf(byte10)) *-1);
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv4(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv4(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = (byte) (Integer.parseInt(String.valueOf(byte1)) *-1);
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = (byte) (Integer.parseInt(String.valueOf(byte4)) *-1);
                    dataarray[byte5loc] = (byte) (Integer.parseInt(String.valueOf(byte5)) *-1);
                    dataarray[byte6loc] = (byte) (Integer.parseInt(String.valueOf(byte6)) *-1);
                    dataarray[byte7loc] = (byte) (Integer.parseInt(String.valueOf(byte7)) *-1);
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = (byte) (Integer.parseInt(String.valueOf(byte9)) *-1);
                    dataarray[byte10loc] = byte10;
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv5(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv5(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = byte1;
                    dataarray[byte2loc] = (byte) (Integer.parseInt(String.valueOf(byte2)) *-1);
                    dataarray[byte3loc] = (byte) (Integer.parseInt(String.valueOf(byte3)) *-1);
                    dataarray[byte4loc] = (byte) (Integer.parseInt(String.valueOf(byte4)) *-1);
                    dataarray[byte5loc] = (byte) (Integer.parseInt(String.valueOf(byte5)) *-1);
                    dataarray[byte6loc] = byte6;
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = (byte) (Integer.parseInt(String.valueOf(byte8)) *-1);
                    dataarray[byte9loc] = (byte) (Integer.parseInt(String.valueOf(byte9)) *-1);;
                    dataarray[byte10loc] = byte10;
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv6(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv6(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = (byte) (Integer.parseInt(String.valueOf(byte1)) *-1);
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = (byte) (Integer.parseInt(String.valueOf(byte3)) *-1);
                    dataarray[byte4loc] = (byte) (Integer.parseInt(String.valueOf(byte4)) *-1);
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = (byte) (Integer.parseInt(String.valueOf(byte6)) *-1);
                    dataarray[byte7loc] = (byte) (Integer.parseInt(String.valueOf(byte7)) *-1);
                    dataarray[byte8loc] = (byte) (Integer.parseInt(String.valueOf(byte8)) *-1);
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = byte10;
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv7(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv7(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = (byte) (Integer.parseInt(String.valueOf(byte1)) *-1);
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = (byte) (Integer.parseInt(String.valueOf(byte4)) *-1);
                    dataarray[byte5loc] = (byte) (Integer.parseInt(String.valueOf(byte5)) *-1);
                    dataarray[byte6loc] = (byte) (Integer.parseInt(String.valueOf(byte6)) *-1);
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = (byte) (Integer.parseInt(String.valueOf(byte8)) *-1);
                    dataarray[byte9loc] = (byte) (Integer.parseInt(String.valueOf(byte9)) *-1);
                    dataarray[byte10loc] = byte10;
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv8(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv8(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = byte1;
                    dataarray[byte2loc] = (byte) (Integer.parseInt(String.valueOf(byte2)) *-1);
                    dataarray[byte3loc] = (byte) (Integer.parseInt(String.valueOf(byte3)) *-1);
                    dataarray[byte4loc] = (byte) (Integer.parseInt(String.valueOf(byte4)) *-1);
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = (byte) (Integer.parseInt(String.valueOf(byte6)) *-1);
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = (byte) (Integer.parseInt(String.valueOf(byte9)) *-1);
                    dataarray[byte10loc] = (byte) (Integer.parseInt(String.valueOf(byte10)) *-1);
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void neginv9(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                neginv9(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/10;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*10;
                    int byte2loc = kk*10 +1;
                    int byte3loc = kk*10 +2;
                    int byte4loc = kk*10 +3;
                    int byte5loc = kk*10 +4;
                    int byte6loc = kk*10 +5;
                    int byte7loc = kk*10 +6;
                    int byte8loc = kk*10 +7;
                    int byte9loc = kk*10 +8;
                    int byte10loc = kk*10 +9;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    dataarray[byte1loc] = byte1;
                    dataarray[byte2loc] = (byte) (Integer.parseInt(String.valueOf(byte2)) *-1);
                    dataarray[byte3loc] = (byte) (Integer.parseInt(String.valueOf(byte3)) *-1);
                    dataarray[byte4loc] = (byte) (Integer.parseInt(String.valueOf(byte4)) *-1);
                    dataarray[byte5loc] = (byte) (Integer.parseInt(String.valueOf(byte5)) *-1);
                    dataarray[byte6loc] = byte6;
                    dataarray[byte7loc] = (byte) (Integer.parseInt(String.valueOf(byte7)) *-1);
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = (byte) (Integer.parseInt(String.valueOf(byte10)) *-1);
                    kk = kk +9;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat0(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat0(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));

            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte1;
                    dataarray[byte2loc] = byte14;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = byte12;
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = byte10;
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = byte6;
                    dataarray[byte11loc] = byte11;
                    dataarray[byte12loc] = byte4;
                    dataarray[byte13loc] = byte13;
                    dataarray[byte14loc] = byte2;
                    dataarray[byte15loc] = byte15;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat1(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat1(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte13;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = byte11;
                    dataarray[byte6loc] = byte6;
                    dataarray[byte7loc] = byte9;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte7;
                    dataarray[byte10loc] = byte10;
                    dataarray[byte11loc] = byte5;
                    dataarray[byte12loc] = byte12;
                    dataarray[byte13loc] = byte3;
                    dataarray[byte14loc] = byte14;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat2(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat2(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte14;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = byte11;
                    dataarray[byte6loc] = byte9;
                    dataarray[byte7loc] = byte8;
                    dataarray[byte8loc] = byte7;
                    dataarray[byte9loc] = byte6;
                    dataarray[byte10loc] = byte10;
                    dataarray[byte11loc] = byte5;
                    dataarray[byte12loc] = byte12;
                    dataarray[byte13loc] = byte13;
                    dataarray[byte14loc] = byte2;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat3(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat3(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte13;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = byte6;
                    dataarray[byte7loc] = byte9;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte7;
                    dataarray[byte10loc] = byte10;
                    dataarray[byte11loc] = byte11;
                    dataarray[byte12loc] = byte12;
                    dataarray[byte13loc] = byte3;
                    dataarray[byte14loc] = byte14;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat4(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat4(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte3;
                    dataarray[byte4loc] = byte12;
                    dataarray[byte5loc] = byte11;
                    dataarray[byte6loc] = byte6;
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = byte10;
                    dataarray[byte11loc] = byte5;
                    dataarray[byte12loc] = byte4;
                    dataarray[byte13loc] = byte13;
                    dataarray[byte14loc] = byte14;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat5(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat5(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte14;
                    dataarray[byte3loc] = byte13;
                    dataarray[byte4loc] = byte12;
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = byte10;
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = byte6;
                    dataarray[byte11loc] = byte11;
                    dataarray[byte12loc] = byte4;
                    dataarray[byte13loc] = byte3;
                    dataarray[byte14loc] = byte2;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat6(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat6(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte13;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = byte10;
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = byte6;
                    dataarray[byte11loc] = byte11;
                    dataarray[byte12loc] = byte12;
                    dataarray[byte13loc] = byte3;
                    dataarray[byte14loc] = byte14;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat7(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat7(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte2;
                    dataarray[byte3loc] = byte13;
                    dataarray[byte4loc] = byte12;
                    dataarray[byte5loc] = byte10;
                    dataarray[byte6loc] = byte6;
                    dataarray[byte7loc] = byte7;
                    dataarray[byte8loc] = byte8;
                    dataarray[byte9loc] = byte9;
                    dataarray[byte10loc] = byte5;
                    dataarray[byte11loc] = byte11;
                    dataarray[byte12loc] = byte4;
                    dataarray[byte13loc] = byte3;
                    dataarray[byte14loc] = byte14;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat8(File target, int error){
        if (target.isDirectory()){ //start logic
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                segscat8(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        } if (target.isFile()){
            byte[] dataarray = null;
            try {
                dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }
            int lenght = dataarray.length;
            int iteration = lenght/15;

            try {
                for (int kk = 0; kk<iteration;kk++){
                    //    logwriter("encrypt iteration " + kk);
                    int byte1loc = kk*15;
                    int byte2loc = kk*15 +1;
                    int byte3loc = kk*15 +2;
                    int byte4loc = kk*15 +3;
                    int byte5loc = kk*15 +4;
                    int byte6loc = kk*15 +5;
                    int byte7loc = kk*15 +6;
                    int byte8loc = kk*15 +7;
                    int byte9loc = kk*15 +8;
                    int byte10loc = kk*15 +9;
                    int byte11loc = kk*15 +10;
                    int byte12loc = kk*15 +11;
                    int byte13loc = kk*15 +12;
                    int byte14loc = kk*15 +13;
                    int byte15loc = kk*15 +14;
                    byte byte1 = dataarray[byte1loc];
                    byte byte2 = dataarray[byte2loc];
                    byte byte3 = dataarray[byte3loc];
                    byte byte4 = dataarray[byte4loc];
                    byte byte5 = dataarray[byte5loc];
                    byte byte6 = dataarray[byte6loc];
                    byte byte7 = dataarray[byte7loc];
                    byte byte8 = dataarray[byte8loc];
                    byte byte9 = dataarray[byte9loc];
                    byte byte10 = dataarray[byte10loc];
                    byte byte11 = dataarray[byte11loc];
                    byte byte12 = dataarray[byte12loc];
                    byte byte13 = dataarray[byte13loc];
                    byte byte14 = dataarray[byte14loc];
                    byte byte15 = dataarray[byte15loc];
                    dataarray[byte1loc] = byte15;
                    dataarray[byte2loc] = byte14;
                    dataarray[byte3loc] = byte13;
                    dataarray[byte4loc] = byte4;
                    dataarray[byte5loc] = byte5;
                    dataarray[byte6loc] = byte10;
                    dataarray[byte7loc] = byte9;
                    dataarray[byte8loc] = byte8; //<--------------
                    dataarray[byte9loc] = byte7;
                    dataarray[byte10loc] = byte6;
                    dataarray[byte11loc] = byte11;
                    dataarray[byte12loc] = byte12;
                    dataarray[byte13loc] = byte3;
                    dataarray[byte14loc] = byte2;
                    dataarray[byte15loc] = byte1;
                    kk = kk +14;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                logwriter("array index out of bounds catch",1);
            }

            try {
                FileOutputStream writer = new FileOutputStream(target, false);
                writer.write(dataarray);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logwriter("processed " + target,error);
        }
    }
    private static void segscat9(File target, int error){
        if (error == 1){
            if (target.isDirectory()){ //start logic
                logwriter("     folder " + target + " found",0);
                File[] targetfiles = new File(String.valueOf(target)).listFiles();
                for (int o =0; o < targetfiles.length; o++){
                    String targetstring = String.valueOf(targetfiles[o]);
                    segscat9(new File(targetstring),0);
                    if (o == targetfiles.length -1){
                        logwriter("        exiting folder",0);
                    }
                }
            }
        }else {
            if (target.isDirectory()){ //start logic
                logwriter("     folder " + target + " found",0);
                File[] targetfiles = new File(String.valueOf(target)).listFiles();
                for (int o =0; o < targetfiles.length; o++){
                    String targetstring = String.valueOf(targetfiles[o]);
                    segscat9(new File(targetstring),0);
                    if (o == targetfiles.length -1){
                        logwriter("        exiting folder",0);
                    }
                }
            } if (target.isFile()){
                byte[] dataarray = null;
                try {
                    dataarray = Files.readAllBytes(Path.of(String.valueOf(target)));
                } catch (IOException e) {
                    logwriter("IO Error" + target,1);
                    e.printStackTrace();
                }
                int lenght = dataarray.length;
                int iteration = lenght/15;

                try {
                    for (int kk = 0; kk<iteration;kk++){
                        //    logwriter("encrypt iteration " + kk);
                        int byte1loc = kk*15;
                        int byte2loc = kk*15 +1;
                        int byte3loc = kk*15 +2;
                        int byte4loc = kk*15 +3;
                        int byte5loc = kk*15 +4;
                        int byte6loc = kk*15 +5;
                        int byte7loc = kk*15 +6;
                        int byte8loc = kk*15 +7;
                        int byte9loc = kk*15 +8;
                        int byte10loc = kk*15 +9;
                        int byte11loc = kk*15 +10;
                        int byte12loc = kk*15 +11;
                        int byte13loc = kk*15 +12;
                        int byte14loc = kk*15 +13;
                        int byte15loc = kk*15 +14;
                        byte byte1 = dataarray[byte1loc];
                        byte byte2 = dataarray[byte2loc];
                        byte byte3 = dataarray[byte3loc];
                        byte byte4 = dataarray[byte4loc];
                        byte byte5 = dataarray[byte5loc];
                        byte byte6 = dataarray[byte6loc];
                        byte byte7 = dataarray[byte7loc];
                        byte byte8 = dataarray[byte8loc];
                        byte byte9 = dataarray[byte9loc];
                        byte byte10 = dataarray[byte10loc];
                        byte byte11 = dataarray[byte11loc];
                        byte byte12 = dataarray[byte12loc];
                        byte byte13 = dataarray[byte13loc];
                        byte byte14 = dataarray[byte14loc];
                        byte byte15 = dataarray[byte15loc];
                        dataarray[byte1loc] = byte15;
                        dataarray[byte2loc] = byte2;
                        dataarray[byte3loc] = byte13;
                        dataarray[byte4loc] = byte12;
                        dataarray[byte5loc] = byte5;
                        dataarray[byte6loc] = byte10;
                        dataarray[byte7loc] = byte14;
                        dataarray[byte8loc] = byte9;
                        dataarray[byte9loc] = byte8;
                        dataarray[byte10loc] = byte6;
                        dataarray[byte11loc] = byte11;
                        dataarray[byte12loc] = byte4;
                        dataarray[byte13loc] = byte3;
                        dataarray[byte14loc] = byte7;
                        dataarray[byte15loc] = byte1;
                        kk = kk +14;
                    }
                }catch (ArrayIndexOutOfBoundsException e){
                    logwriter("array index out of bounds catch",1);
                }

                try {
                    FileOutputStream writer = new FileOutputStream(target, false);
                    writer.write(dataarray);
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                logwriter("processed " + target,error);
            }
        }

    }
    private static void method(File target, int error){
        if (target.isDirectory()){
            logwriter("     folder " + target + " found",0);
            File[] targetfiles = new File(String.valueOf(target)).listFiles();
            for (int o =0; o < targetfiles.length; o++){
                String targetstring = String.valueOf(targetfiles[o]);
                method(new File(targetstring),0);
                if (o == targetfiles.length -1){
                    logwriter("        exiting folder",0);
                }
            }
        }if (target.isFile()){
            byte[] bytearray;
            try {
                bytearray = Files.readAllBytes(Path.of(String.valueOf(target)));
            } catch (IOException e) {
                logwriter("IO Error" + target,1);
                e.printStackTrace();
            }

        }
    }
    private static void hozsorter(File target, int error, int num){
        logwriter("                 Sort 1",error);
        switch (num) {
            case 0:
            case 7:
                hozinv7(target,error);
                break;
            case 1:
            case 8:
                hozinv8(target,error);
                break;
            case 2:
                hozinv2(target,error);
                break;
            case 3:
                hozinv3(target,error);
                break;
            case 4:
                hozinv4(target,error);
                break;
            case 5:
                hozinv5(target,error);
                break;
            case 6:
                hozinv6(target,error);
                break;
            case 9:
                hozinv9(target,error);
                break;
        }
    }
    private static void val2sort(File target, int error, int num){
        logwriter("                 Sort 2",error);
        switch (num){
            case 0:
                neginv0(target,error);
                break;
            case 1:
                neginv1(target,error);
                break;
            case 2:
                neginv2(target,error);
                break;
            case 3:
                neginv3(target,error);
                break;
            case 4:
                neginv4(target,error);
                break;
            case 5:
                neginv5(target,error);
                break;
            case 6:
                neginv6(target,error);
                break;
            case 7:
                neginv7(target,error);
                break;
            case 8:
                neginv8(target,error);
                break;
            case 9:
                neginv9(target,error);
                break;
        }
    }
    private static void val3sort(File target, int error, int num){
        logwriter("                 Sort 3",error);
        switch (num){
            case 0:
                segscat0(target,error);
                break;
            case 1:
                segscat1(target,error);
                break;
            case 2:
                segscat2(target,error);
                break;
            case 3:
                segscat3(target,error);
                break;
            case 4:
                segscat4(target,error);
                break;
            case 5:
                segscat5(target,error);
                break;
            case 6:
                segscat6(target,error);
                break;
            case 7:
                segscat7(target,error);
                break;
            case 8:
                segscat8(target,error);
                break;
            case 9:
                segscat9(target,error);
                break;
        }
    }
    private static void encrypthandler(File target, String passphrase,int error){
        int val1 = Integer.parseInt(String.valueOf(passphrase.charAt(0)));
        int val2 = Integer.parseInt(String.valueOf(passphrase.charAt(1)));
        int val3 = Integer.parseInt(String.valueOf(passphrase.charAt(2)));
        hozsorter(target,error, val1);
        val2sort(target,error,val2);
        val3sort(target,error, val3);
    }
    private static void decrypthandler(File target, String passphrase,int error){
        int val1 = Integer.parseInt(String.valueOf(passphrase.charAt(0)));
        int val2 = Integer.parseInt(String.valueOf(passphrase.charAt(1)));
        int val3 = Integer.parseInt(String.valueOf(passphrase.charAt(2)));
        val3sort(target,error, val3);
        val2sort(target,error, val2);
        hozsorter(target,error, val1);
    }
    private static void renamehandler(File target, int onoff){
        String targetstring = String.valueOf(target);
        String renamestring = "";
        if (onoff == 0){ // we are encrypting
            if (target.isDirectory()){ //target is file
                renamestring = targetstring + "(locked)";
                target.renameTo(new File(renamestring));
            }

        }if (onoff ==1){
            if (target.isDirectory()){
                int forint = targetstring.length() - 8; // lenght starts at 0
                for (int l =0; l < forint; l++){
                    renamestring = renamestring + targetstring.charAt(l);
                }
                target.renameTo(new File(renamestring));
            }
        }
    }
    private static void logwriter(String input,int error){
        String filelogstring = "C:\\filelock_consle\\config.txt";
        if (String.valueOf(input) == ""){
            try {
                FileWriter logfilewriter = new FileWriter(filelogstring , false);
                logfilewriter.write(input);
                logfilewriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        FileWriter logfilewirtier = null;
        try {
            logfilewirtier = new FileWriter(filelogstring,true);
            logfilewirtier.write(input+"\n");
            logfilewirtier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(input);
    }
    private static boolean pincny(String passphrase){
        String ss1 = String.valueOf(passphrase.charAt(4));
        String ss2 = String.valueOf(passphrase.charAt(3));
        String pinnum = ss1 + ss2;
        int punnum = Integer.parseInt(pinnum);
        LocalDateTime ldt = LocalDateTime.now();
        int checknum = Integer.parseInt(ldt.format(DateTimeFormatter.ofPattern("mm")));
        int istnum = Integer.parseInt(ldt.format(DateTimeFormatter.ofPattern("dd")));
        int sndnum = istnum + checknum;
        if (sndnum >= 100){
            String ccc = String.valueOf(sndnum);
            sndnum = ccc.charAt(1) + ccc.charAt(2);
        }
        if (punnum == sndnum){
            return true;
        }else {
            return false;
        }
    }
    public static String classhandler(File targetfile, String passphrase, int onoff){ // try adding method to get bytes then send to another to process
        int error = 0;
        String secretunr = securityfilehandler(targetfile, onoff);
        logwriter("",error);
        Boolean pinok = pincny(passphrase);
        if (pinok){
            if (onoff == 0){
                encrypthandler(targetfile, passphrase,error);
                renamehandler(targetfile, onoff);
            }
            if (onoff == 1){
                decrypthandler(targetfile, passphrase,error);
                renamehandler(targetfile, onoff);
            }
            if (secretunr == "security"){
                return "security";
            }if (secretunr == "secwarn"){
                return "secwarn";
            }else {
                return "good";
            }
        } if (!pinok){
            return "pin";
        }
        return "unreachable";
    }
    private static String securityfilehandler(File targetfile, int onoff){
        File configfile = new File("C:\\filelock_consle\\config.txt");
        if (!configfile.exists()){
            try {
                FileWriter firsttimewriter = new FileWriter(configfile);
                firsttimewriter.write("01281650   C:\\NODATA\n" +
                        "01271217   C:\\NODATA\n" +
                        "01271217   C:\\NODATA\n" +
                        "01270426   C:\\NODATA\n" +
                        "01171050   C:\\NODATA");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        LocalDateTime datetime = LocalDateTime.now();
        String writedate = datetime.format(DateTimeFormatter.ofPattern("MMddHHmm"));
        String line0 = "", line1 = "", line2 = "",line3 = "",line4 = "";
        if (onoff ==  1){
            try {
                Scanner filereader = new Scanner(configfile);
                line0 = filereader.nextLine();
                line1 = filereader.nextLine();
                line2 = filereader.nextLine();
                line3 = filereader.nextLine();
                line4 = filereader.nextLine();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int line0int = Integer.parseInt(String.valueOf(line0.charAt(0) + line0.charAt(1) +line0.charAt(2) + line0.charAt(3)+line0.charAt(4) + line0.charAt(5)+line0.charAt(6) + line0.charAt(7)));
            int line1int = Integer.parseInt(String.valueOf(line1.charAt(0) + line1.charAt(1) +line1.charAt(2) + line1.charAt(3)+line1.charAt(4) + line1.charAt(5)+line1.charAt(6) + line1.charAt(7)));
            int line2int = Integer.parseInt(String.valueOf(line2.charAt(0) + line2.charAt(1) +line2.charAt(2) + line2.charAt(3)+line2.charAt(4) + line2.charAt(5)+line2.charAt(6) + line2.charAt(7)));
            int line3int = Integer.parseInt(String.valueOf(line3.charAt(0) + line3.charAt(1) +line3.charAt(2) + line3.charAt(3)+line3.charAt(4) + line3.charAt(5)+line3.charAt(6) + line3.charAt(7)));
            int line4int = Integer.parseInt(String.valueOf(line4.charAt(0) + line4.charAt(1) +line4.charAt(2) + line4.charAt(3)+line4.charAt(4) + line4.charAt(5)+line4.charAt(6) + line4.charAt(7)));
// if the same file is accessed 5 times in the last hour  use same hour for simplicity  //currently kills if 5 times accessed in same minutre
            try {
                FileWriter securitywriterx = new FileWriter(configfile, false);
                securitywriterx.write(writedate+"   "+targetfile + "\n" + line0 +"\n" + line1 + "\n" + line2 + "\n" + line3);
                securitywriterx.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line0int == line1int && line1int == line2int && line2int ==line3int && line3int == line4int){
                return "security";
            }if (line0int == line1int && line1int == line2int && line2int ==line3int){
                return "secwarn";
            }else {
                return "";
            }
        }else {
            return "";
        }
    }
}
