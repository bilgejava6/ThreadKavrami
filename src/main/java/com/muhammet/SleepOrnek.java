package com.muhammet;

import java.util.Scanner;

public class SleepOrnek {
    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            do{
                System.out.println("DAVULA VURDU");
                try {
                    Thread.sleep(2_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }while (true);
        }).start();


        int secim;
        do{
            System.out.println("*******************************");
            System.out.println("*********    İSLEM     ********");
            System.out.println("*******************************");
            System.out.println("1- Toplama");
            System.out.println("2- Çarpma");
            System.out.println("0- ÇIKIS");

            Scanner sc = new Scanner(System.in);
            System.out.println("Lütfen seçiniz.....: ");
            secim = sc.nextInt();
        }while (secim!=0);
        System.out.println("Kapandı.");
    }
}
