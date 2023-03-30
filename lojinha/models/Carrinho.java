package models;

import java.util.Arrays;

import models.interfaces.CarrinhoInterface;

public class Carrinho implements CarrinhoInterface{
    int i = 0;
    Produto listProdutos[] = new Produto[10];

    @Override
    public void adicionar(Produto produto){
        this.listProdutos[i] = produto;
        System.out.println("Adicionado ao carrinho!");
        i += 1; 
    }

    @Override
    public void deletar(Produto produto){
        listProdutos[Arrays.binarySearch(listProdutos, produto)] = null;
        System.out.println("produto deletado!");
    }

    @Override
    public void listar(){
        System.out.println("---------- Carrinho -----------");
        for (int controller = 0; controller < listProdutos.length; controller++){
            if(listProdutos[controller]!=null){
                System.out.printf("%f - "+listProdutos[controller]+";\n", controller);
            };
        }
    }
}
