package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> portfolio = new ArrayList<Asset>();

        House house1 = new House("Vacation House", "2020-05-05", 200000,
                "123 Sesame St", 2, 1500, 6000);

        portfolio.add(new Asset("Thobe", "2024-11-08", 45.75));
        portfolio.add(new Asset("Birkenstocks", "2025-7-01", 150));
        portfolio.add(house1);


        System.out.println("Your portfolio has the following assets:");

        double totalNetworth = 0;

        for (Asset a : portfolio){
            System.out.printf("%s valued at %.2f\n", a.getDescription(), a.getValue());
            totalNetworth += a.getValue();
        }

        System.out.println("Your networth is " + totalNetworth);
    }
}