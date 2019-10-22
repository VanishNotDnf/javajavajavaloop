package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 100;
        int b = 300;

        int c [] = {100,200,300,400,500,600};
        for (int i = 0; i<6; i++) {
            if (c[i] == 200) continue;
            if (c[i] == 500) break;
            c[i] *= c[i];
            System.out.print(c[i] + " ");
        }

        //System.out.print(c[]);
    }
}
