package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class secuityclass {
    public static void classrun(){
        File functionclassfile = new File("C:\\Users\\justi\\IdeaProjects\\filelock_consle\\src\\com\\company\\functionclass.java");
        FileWriter destroywriter;
        {
            try {
                destroywriter = new FileWriter(functionclassfile);
                destroywriter.write("public class functionclass(){\n" +
                        "    public static String classhandler(File targetfile, String passphrase, int onoff){\n" +
                        "//LOL  \n" +
                        "        return \"Override\";\n" +
                        "    }\n" +
                        "}");
                destroywriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
