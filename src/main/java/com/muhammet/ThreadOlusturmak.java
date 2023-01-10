package com.muhammet;

public class ThreadOlusturmak {
    public static void main(String[] args) {
        /**
         * Thread direkt çalışabilir.
         * Runnable bir thread içinde start edilmelidir.
         */
        Deger deger = new Deger();
        deger.sayi = 20;
        MyThread myThread = new MyThread(deger);
        MyRunnable myRunnable = new MyRunnable(deger);
        Thread mt = new Thread(myRunnable);
        mt.start();
        myThread.run();
    }

} //ThreadOluturmak Class Sonu
class Deger{
    int sayi;
}
class MyThread extends  Thread{
    Deger d;
    public MyThread(Deger d){
        this.d = d;
    }
    public void run(){
        for (int i=0; i<100;i++){
            d.sayi++;
            System.out.println("MyThread........: "+d.sayi);
        }
    }
}

class MyRunnable implements Runnable{
    Deger d;
    public MyRunnable(Deger d){
        this.d = d;
    }
    @Override
    public void run() {
        for (int i=0; i<100;i++){
            d.sayi--;
            System.out.println("MyRunnable........: "+d.sayi);
        }
    }
}
