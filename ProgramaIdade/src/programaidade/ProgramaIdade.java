/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author Black
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        int nasc = t.nextInt();
        int idade = 2017 - nasc;
        
        System.out.print("Sua idade é "+ idade + " vc é ");
        if (idade>=18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
    }
    
}
