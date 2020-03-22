package com.br.students.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
        
         private Scanner scanner = new Scanner(System.in);
         private ArrayList<String> arlist = new ArrayList<String>();   
    
        public static void main(String[] args) {
          Menu();
        }       

       public static void TelaMenu(){
            System.out.println("Menu");
            System.out.println("Digite 1 para inserir o estudante ");
            System.out.println("Digite 2 para imprimir a lista ");

            String option = scanner.nextLine();
        }
       
       
       public static void Menu(){
            
            if (option.equals("1")) {
                novoAluno();
            }        
            else if (option.equals("2")) {
                exibirusuario();
            } else {
                System.out.println("Digite uma opção válida");
                TelaMenu();
        }
        public static void novoAluno(){
            
                System.out.println("Digite o nome do aluno: ");
                String name = scanner.nextLine();
                
                if (!arlist.contains(name)) {
                    arlist.add(name);
                } else {
                    System.out.println("O aluno já esta cadastrado!");
                }
        }
                

       public static void exibirusuario(){
            System.out.println("Lista ALunos");
            arlist.forEach(aluno -> {System.out.println(aluno)});
        }
    }
}
    

    

