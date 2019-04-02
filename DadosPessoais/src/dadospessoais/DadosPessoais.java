/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadospessoais;
import java.util.Scanner;

/**
 *
 * @author Mrgarida Saleth
 */
public class DadosPessoais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        
        int idade;
        String nome;
        String morada;
        String naturalidade;
        double altura;
        String data_nascimento;
       
       
       
        
         System.out.println("digite a idade");
         idade=read.nextInt();
         if(idade>=18) {
            System.out.println("Introduza os teus dados pessoais");
            System.out.println("digite o nome");
            nome=read.next();
            System.out.println("digite o morada");
            morada=read.next();
            System.out.println("digite o naturalidade");
            naturalidade=read.next();
            System.out.println("digite a altura");
            altura=read.nextDouble();
            System.out.println("digite a data de nascimento");
            data_nascimento=read.next();
        
        } else
          {
            System.out.println("Não lhe é permitido introduzir os teus dados pessoais");
          }
       
       

        
        // TODO code application logic here
    }
    
}
