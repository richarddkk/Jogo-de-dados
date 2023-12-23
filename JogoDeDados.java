package com.mycompany.jogodedados;
import java.util.Random;
import java.util.Scanner;
 // @author richarddkk

 
public class JogoDeDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Bem vindo ao jogo de dados");
        
        while (true) {
            System.out.println("Pressione Enter para lançar os dados (ou digite 'sair' para sair): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("sair")){
                System.out.println("Obrigado por jogar.");
                break;
            }
            
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
                
            System.out.println("Dado 1: "+ dado1);
            System.out.println("Dado 2: "+ dado2);
            
            int soma = dado1 + dado2;
            System.out.println("Soma dos dados: "+soma);
            
            System.out.println("Continue jogando...");
            
        }
        
    }
}
