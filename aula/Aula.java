package aula;

import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        String nome;
        Scanner input = new Scanner(System.in);
        nome = input.next();
        f1.Funcionario(nome, "30/10/2004");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Data de Nascimento: " + f1.getData_nascimento());
        input.close();
    }
    
}

