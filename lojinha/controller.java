import models.*;
import java.util.Scanner;

import funcoes.Operacoes;

public class controller{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        Integer opcao;
        boolean controll = true;

        do{
            System.out.println("-----------------------------");
            System.out.println("---------- Lojinha ----------");
            System.out.println("-----------------------------");
            System.out.println("   [0] - Exit()");
            System.out.println("   [1] - Cadastrar");
            System.out.println("   [2] - Listar produtos");
            System.out.println("   [3] - Carrinho");
            System.out.println("   [4] - Ver dados");

            System.out.print("Escolha uma opção: ");
            opcao = new Integer(input.nextLine());

            switch (opcao){
                case 0:
                    controll = false;
                    break;
                case 1:
                    operacoes.cadastro();
                    break;
                case 2:
                    operacoes.lista_produtos();
                    break;
                case 3:
                    operacoes.carrinho();
                    break;
                case 4:
                    operacoes.verDados();
                    break;
                default:
                    System.out.println("[ERROR] Opção invalida!!!");
            }
        } while (controll);
    };
};