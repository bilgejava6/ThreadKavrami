package com.muhammet;

import java.util.List;

public class AtomikKullanim {
    public static void main(String[] args) {
        List<String> isimler =
                List.of("Ali","Ahmet","Ayşe","Aynur","Ayhan","Bahar","Belçim");
        /**
         * Bir listeyi
         * For ile
         * Forech ile
         * .forech()
         */
        int toplam=0;
        System.out.println("For ");
        for(int i=0;i<isimler.size();i++){
            toplam += isimler.get(i).length();
            System.out.println(isimler.get(i));
        }
        System.out.println("toplam uzunluk...: "+ toplam);
        System.out.println("-------------------------------------");
        System.out.println(".forech");
        int toplam2=0;
        /**
         *
         * AtomicInteger nedir. Atomic ler nedir?
         */
        isimler.forEach(x->{
            toplam2 += x.length();
            System.out.println(x);
        });
        System.out.println("toplam uzunluk...: "+ toplam2);
    }
}
