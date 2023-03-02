package ciklusok;

import java.util.Scanner;

public class Szamok {

    public static void main(String[] args) {

        Scanner bekeres = new Scanner(System.in);
        System.out.print("Töbször akarunk egy számot felhasználni [igen | nem]: ");
        String valasz = bekeres.next();
        if (valasz.equals("igen")) {
            for (int k = 2; k <= 4; k++) {
                for (int i = 2; i <= 4; i++) {
                    for (int j = 2; j <= 4; j++) {
                        System.out.printf("%d%d%d\n", k, i, j);
                    }
                }
            }
        } else if (valasz.equals("nem")) {
            for (int k = 2; k <= 4; k++) {
                for (int i = 2; i <= 4; i++) {
                    for (int j = 2; j <= 4; j++) {
                        if ((i != j) && (k != i)) {
                            System.out.printf("%d%d%d\n", k, i, j);
                        }

                    }
                }
            }
        } else {
            System.out.println("Nincs ilyen lehetőség!");
        }

    }

}
