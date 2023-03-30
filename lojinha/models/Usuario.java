package models;

import funcoes.*;
import models.interfaces.UsuarioInterface;

public class Usuario extends Pessoa implements UsuarioInterface {
    private String idUsuario, user, password, altDado;
    String[] dados;
    Carrinho carrinho;
    Verifica verif = new Verifica();
    EntradaUser entrada = new EntradaUser();    


    public Usuario(String nome, String sexo, String dataNasc, String cpf, String idUsuario, String user, String password, Carrinho carrinho){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setDataNasc(dataNasc);
        this.setCpf(cpf);
        this.idUsuario = idUsuario;
        this.user = user;
        this.password = password;
        this.carrinho = carrinho;
    }

    public String getUser(){
        return this.user;
    }

    

    public void apresentacao(){
        System.out.println("Nome do usuario: " + this.getNome());
        System.out.println("Sexo do usuario: " + this.getSexo());
        System.out.println("Data de nascimento do usuario: " + this.getDataNasc());
    }

    public String verPasswordIntern(){
        return this.password;
    }


    @Override
    public Carrinho verCarrinho(){
        return this.carrinho;
    }

    @Override
    public String verNome(){
        return this.getNome();
    }
    @Override
    public void altNome(){
        this.dados = entrada.userAtual();
        
        if (verif.verifUsuer(this.dados[0],  this.dados[1], this)){
            System.out.print("Novo User: ");
            this.altDado = entrada.recebeNovoDado("Novo user: ");

            this.setNome(this.altDado);
        }else{
            System.out.println("User ou senha incorretos!");
        }
    }

    @Override
    public String verDataNasc(){
        return this.getDataNasc();
    }
    @Override
    public void altDataNasc(){
        this.dados = entrada.userAtual();
        if (verif.verifUsuer(this.dados[0],  this.dados[1], this)){
            this.altDado = entrada.recebeNovoDado("Novo data: ");

            this.setDataNasc(this.altDado);
        }else{
            System.out.println("User ou senha incorretos!");
        }
    }

    @Override
    public String verSexo(){
        return this.getSexo();
    }
    @Override
    public void altSexo(){
        this.dados = entrada.userAtual();
        if (verif.verifUsuer(this.dados[0],  this.dados[1], this)){
            this.altDado = entrada.recebeNovoDado("Novo Sexo: ");

            this.setSexo(this.altDado);
        }else{
            System.out.println("User ou senha incorretos!");
        }
    }

    @Override
    public String verCpf(Usuario instancia){
        this.dados = entrada.userAtual();
        boolean v = verif.verifUsuer(this.dados[0],  this.dados[1], instancia);
        System.out.println(v);
        if (v){
            return this.getCpf();
        }else{
            System.out.println("User ou senha incorretos!");
            return "";
        }
    }
    @Override
    public void altCpf(){
        this.dados = entrada.userAtual();
        if (verif.verifUsuer(this.dados[0],  this.dados[1], this)){
            this.altDado = entrada.recebeNovoDado("Novo CPF: ");

            this.setCpf(this.altDado);
        }else{
            System.out.println("User ou senha incorretos!");
        }
    }

    @Override
    public String verIdUsuario(){
        this.dados = entrada.userAtual();
        if (verif.verifUsuer(this.dados[0],  this.dados[1], this)){
            return this.idUsuario;
        }else{
            System.out.println("User ou senha incorretos!");
            return "";
        }
    }
    @Override
    public void altIdUsuario(){
        this.dados = entrada.userAtual();
        if (verif.verifUsuer(this.dados[0],  this.dados[1], this)){
            this.altDado = entrada.recebeNovoDado("Novo IdUsuário: ");

            this.idUsuario = this.altDado;
        }else{
            System.out.println("User ou senha incorretos!");
        }
    }

    @Override
    public String verUser(){
        return this.user;
    }
    @Override
    public void altUser(){
        this.dados = entrada.userAtual();
        if (verif.verifUsuer(this.dados[0],  this.dados[1], this)){
            this.altDado = entrada.recebeNovoDado("Novo user: ");

            this.user = this.altDado;
        }else{
            System.out.println("User ou senha incorretos!");
        }
    }

    @Override
    public String verPassword(){
        this.dados = entrada.veracidade();
        if (verif.verifVericidade(this.dados[0],  this.dados[1], this)){
            return this.password;
        }else{
            System.out.println("User ou senha incorretos!");
            return "";
        }
    }
    @Override
    public void altPassword(){
        this.dados = entrada.password();
        if (verif.verifPassword(this.dados[0], this)){
            this.altDado = entrada.recebeNovoDado("Nova senha: ");

            this.password = this.altDado;
        }else{
            System.out.println("User ou senha incorretos!");
        }
    }









}
