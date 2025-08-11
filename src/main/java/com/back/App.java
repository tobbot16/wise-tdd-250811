package com.back;

import java.util.Scanner;

public class App {

    private static Scanner sc;
    public App(Scanner sc){
        this.sc = sc;
    }
    public static void run(){
        System.out.println("=== 명언 앱 ===");

        while(true){
            String cmd = sc.nextLine();

            if(cmd.equals("등록")){
                System.out.print("명령) ");
                String saying = sc.nextLine();
                System.out.println("명언 : ");
                String author = sc.nextLine();
                System.out.println("작가 : ");
            }else if(cmd.equals("종료"))
                break;
        }


    }

}
