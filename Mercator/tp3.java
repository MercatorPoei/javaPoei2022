package Mercator;

import java.util.Scanner;

public class tp3 {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Tapez le chiffre correspondant a un jour :");
        int num1 = keyboardInput.nextInt();

        if(num1 < 0 && num1 > 7){

        }
        switch(num1) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("=== NOK ===");
        }

    }

}
