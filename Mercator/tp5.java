package Mercator;

import java.util.Scanner;

public class tp5 {
    public static void main(String[] args) {

        try{

            Scanner keyboardInput = new Scanner(System.in);
            System.out.print("Tapez le chiffre correspondant a un jour :");
            int num1 = keyboardInput.nextInt();
            verifyDays(num1);

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }




    public static void verifyDays(int days) throws Exception {

        if(days > 6 || days < 0){
            throw  new Exception("Cela ne correspond à aucun jour");
        }
            switch(days) {
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

            }
    }
}
