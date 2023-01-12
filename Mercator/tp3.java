package Mercator;

import java.util.Scanner;

public class tp3 {

    public static void main(String[] args) {
        String[] tabFr = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        String[] tabEng = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String[] tab;

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Tapez le chiffre correspondant a un jour :");
        int num1 = keyboardInput.nextInt();

        System.out.println("Tapez la langue: 1 FR, 2 EN");
        System.out.println();
        int langue = keyboardInput.nextInt();

        if(langue == 1){
            tab = tabFr;
        }else{
            tab = tabEng;
        }

        switch(num1) {
            case 1:
                System.out.println(tab[0]);
                break;
            case 2:
                System.out.println(tab[1]);
                break;
            case 3:
                System.out.println(tab[2]);
                break;
            case 4:
                System.out.println(tab[3]);
                break;
            case 5:
                System.out.println(tab[4]);
                break;
            case 6:
                System.out.println(tab[5]);
                break;
            case 7:
                System.out.println(tab[6]);
                break;
            default:
                System.out.println("=== NOK ===");
        }

    }
}
