package com.back;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {

    public static String run(String input){
        Scanner sc = TestUtil.genScanner(input);
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();
        new App(sc).run();
        return outputStream.toString();

    }

}
