/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import java.util.Scanner;
import Backend.ListaUtilizadores;
import Backend.Utilizador;

/**
 *
 * @author User
 */
public class Login {

    public static void main(String[] args) {
        
        
        String password;
        String username;
        String nome;
        String morada;
        String telefone;
        String email;
        
        
        ListaUtilizadores lu = new ListaUtilizadores();
        
        Utilizador u2 = new Utilizador("1","1" , "1", "1", "1", "1");
        lu.inserir(u2);

        Scanner ler = new Scanner(System.in);
        int termina=0;
        while (termina==0)
        {
        System.out.println("MENU PRINCIPAL");
        System.out.println(" 1. Registar");
        System.out.println(" 2. Login");
        System.out.println(" 3. Listar Uitlizadores");
        System.out.println(" 4. Alterar Perfil");
        System.out.println(" 5. Sair");
        System.out.println("Escolha uma opção:");
        int opcao = ler.nextInt();
        while (opcao < 1 || opcao > 5) {
            System.out.println("Opção Inválida !");
            System.out.println("MENU PRINCIPAL");
            System.out.println(" 1. Registar");
            System.out.println(" 2. Login");
            System.out.println(" 3. Listar Uitlizadores");
            System.out.println(" 4. Alterar Perfil");
            System.out.println(" 5. Sair");
            System.out.println("Escolha uma opção:");
            opcao = ler.nextInt();
        }

        System.out.println("\n");
        switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                nome=ler.next();
                
                System.out.print("Morada: ");
                morada=ler.next();
                
                System.out.print("Telefone: ");
                telefone=ler.next();
                
                System.out.print("Email: ");
                email=ler.next();
                
                System.out.print("Username: ");
                username=ler.next();
                
                System.out.print("Password: ");
                password=ler.next();
                
                
                Utilizador u1 = new Utilizador(username, password, nome, morada, telefone, email);
                lu.inserir(u1);
                break;
            case 2:
                
                System.out.println("LOGIN ");
                System.out.print("Username: ");
                username=ler.next();
                System.out.print("Password: ");
                password=ler.next();
                lu.login(username,password);
                
            break;
                
                        
                
            case 3:
                lu.listar();
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                
                break;
        }
        System.out.println("0 - Continuar");
        System.out.println("1 - Termina");
        termina = ler.nextInt();
        }

        
        
    }
    
    
}
