package models;

public abstract class Pessoa {
    private String nome, sexo, dataNasc, cpf;


    protected String getNome(){
        return this.nome;
    };
     
    protected String getSexo(){
        return this.sexo;
    };

    protected String getDataNasc(){
        return this.dataNasc;
    };

    protected String getCpf(){
        return this.cpf;
    };

    protected void setNome(String novoNome){
        this.nome = novoNome;
        System.out.println("Nome de usuário alterado com sucesso!");
    };

    protected void setSexo(String novoSexo){
        this.sexo = novoSexo;
        System.out.println("Sexo de usuário alterado com sucesso!");
    };

    protected void setDataNasc(String novoDataNasc){
        this.dataNasc = novoDataNasc;
        System.out.println("Data de nascimento de usuário alterado com sucesso!");
    };

    protected void setCpf(String novoCpf){
        this.cpf = novoCpf;
        System.out.println("Cpf de usuário alterado com sucesso!");
    };
};
