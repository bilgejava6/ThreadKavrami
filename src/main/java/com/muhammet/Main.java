package com.muhammet;

public class Main {
    public static void main(String[] args) {
        /**
         * Main Thread
         */
        long start = System.currentTimeMillis();
        new Thread(()->{
            long toplam1=0;

            for(long i=0;i<20_000_000_000L;i++){
                toplam1++;
            }
            System.out.println("toplam1.....: "+ toplam1);
        }).start();
        new Thread(()->{
            long toplam1=0;

            for(long i=0;i<20_000_000_000L;i++){
                toplam1++;
            }
            System.out.println("toplam2.....: "+ toplam1);
        }).start();
        new Thread(()->{
            long toplam1=0;

            for(long i=0;i<20_000_000_000L;i++){
                toplam1++;
            }
            System.out.println("toplam3.....: "+ toplam1);
        }).start();
        long toplam2=0;
        for(long i=0;i<30_000_000_000L;i++){
            toplam2++;
        }
        System.out.println("toplam4.....: "+ toplam2);
        long end = System.currentTimeMillis();
        System.out.println("Toplam süre....: "+ (end-start));



    }
}