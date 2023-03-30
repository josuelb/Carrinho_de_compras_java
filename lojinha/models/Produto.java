package models;

import models.interfaces.ProdutoInterface;
import funcoes.EntradaUser;

public class Produto implements ProdutoInterface{
    private String nome, marca, descricao;
    private float preco;
    EntradaUser input = new EntradaUser();

    public Produto(String nome, String marca, float preco, String descricao){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void apresentar_produto(){
        System.out.printf("O produto: %f da marca %f", this.nome, this.marca);
        System.out.printf("Preço: %f", this.preco);
        System.out.printf("Descrição: %f", this.descricao);
    }

    @Override
    public void verNome(){
        System.out.println(this.nome);
    }
    @Override 
    public void altNome(){
        String novoDado = input.recebeNovoDado("Novo nome: ");
        this.nome = novoDado;
    }

    @Override
    public void verMarca(){
        System.out.println(this.marca);
    }
    @Override 
    public void altMarca(){
        String novoDado = input.recebeNovoDado("Nova marca: ");
        this.marca = novoDado;
    }

    @Override
    public void verPreco(){
        System.out.println(this.preco);
    }
    @Override 
    public void altPreco(){
        Float novoDado = Float.valueOf(input.recebeNovoDado("Novo preco: "));
        this.preco = novoDado;
    }

    @Override
    public void verDescricao(){
        System.out.println(this.descricao);
    }
    @Override 
    public void altDescricao(){
        String novoDado = input.recebeNovoDado("Nova descricao: ");
        this.descricao = novoDado;
    }
}
