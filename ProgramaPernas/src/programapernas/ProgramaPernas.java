/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o numero de pernas: ");
        int pernas = tec.nextInt();
        String tipo;
        System.out.print("Isso é um: ");
        switch (pernas){
            case 1: 
                tipo = "Saci";
                break;
            case 2:
                tipo = "bibede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            default:
                tipo = "et";
                break;
        }
        System.out.println(tipo);
    }
    
}
