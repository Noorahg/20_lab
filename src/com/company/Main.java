package com.company;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
     do{String daysi=sc.nextLine();
     Days day= Days.valueOf(daysi);
     System.out.println(day);
    }while (true);
}
}
