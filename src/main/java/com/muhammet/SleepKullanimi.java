package com.muhammet;

public class SleepKullanimi {
    public static void main(String[] args) throws Exception {
        System.out.println("İşlemler başladı lütfen bekleyiniz.");
        Thread.sleep(5_000);
        System.out.println("Beklediniz için teşekkürler. işlemler aktif");
        for(int i=0;i<10;i++){
            System.out.print(". ");
            Thread.sleep(2_000);
        }
        System.out.println();
        System.out.println("İşlem Sonlandı.");

    }
}
