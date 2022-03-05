package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class UF_HWQUPC_TestClient {
    public static int Count(UF_HWQUPC uf, int numberOfSites) {
        int numberOfPairs = 0;
        Random random = new Random();
        while (uf.components() != 1) {
            uf.connect(random.ints(0, numberOfSites).findFirst().getAsInt(), random.ints(0, numberOfSites).findFirst().getAsInt());
            numberOfPairs++;
        }
        return numberOfPairs;
    }

    public static void main(String[] args){
        System.out.println("Provide an Integer value to determine the number of sites :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random random = new Random();
        for (int i = 1; i < 100; i++) {
            int numberOfSites = random.ints(0, n-1).findFirst().getAsInt();
            UF_HWQUPC uf = new UF_HWQUPC(numberOfSites);
            int numberOfConnections = Count(uf, numberOfSites);
            System.out.println("Number of Sites : " + numberOfSites + " Number of Connections : "+ numberOfConnections);
        }
    }
}
