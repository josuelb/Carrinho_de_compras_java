package funcoes;

import models.*;
import java.util.Scanner;


public class Operacoes {
    Usuario usuario;
    Produto[] produtos = new Produto[10];
    Scanner input = new Scanner(System.in);

    public void lista_produtos(){
        System.out.println("--------- Lista de produtos -----------");
        for (int controller = 0; controller < produtos.length; controller++){
            if (produtos[controller] != null){
                System.out.println(produtos[controller]);
            };
        }
    }

    public void cadastro(){
        String user, password, nome, sexo, dataNasc, cpf;
        Carrinho carrinho = new Carrinho();

        System.out.print("User: ");
        user = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();
        System.out.print("Nome completo: ");
        nome = input.nextLine();
        System.out.print("Sexo: ");
        sexo = input.nextLine();
        System.out.print("Data de nasc: ");
        dataNasc = input.nextLine();
        System.out.print("CPF: ");
        cpf = input.nextLine();

        usuario = new Usuario(nome, sexo, dataNasc, cpf, "1", user, password, carrinho);

        System.out.println("Usuario criado com sucesso!");
        usuario.apresentacao();
    }

    public void carrinho(){
        this.usuario.verCarrinho();
    }

    public void verDados(){
        this.usuario.apresentacao();
        boolean c = true;
        do{
            System.out.println("--------------------------------------");
            System.out.println("---------- Dados do Usuário ----------");
            System.out.println("--------------------------------------");
            System.out.println("   [0] - Exit()");
            System.out.println("   [1] - CPF");
            System.out.println("   [2] - Id de usuario");
            System.out.println("   [3] - Alterar o CPF");
            System.out.println("   [4] - Alterar a senha");
            System.out.print("Digitem a opção desejada: ");
            Integer resp = new Integer(input.nextLine());

            switch (resp){
                case 0:
                    c = false;
                    break;
                case 1:
                    System.out.println(this.usuario.verCpf());
                    break;
                case 2:
                    System.out.println(this.usuario.verIdUsuario());
                    break;
                case 3:
                    this.usuario.altCpf();
                    break;
                case 4:
                    this.usuario.altPassword();
                    break;
                default:
                    System.out.println("[ERROR] Opção invalida");
            }
        } while (c);
    }
}
