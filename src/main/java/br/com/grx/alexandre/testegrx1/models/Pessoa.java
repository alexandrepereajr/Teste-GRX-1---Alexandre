package br.com.grx.alexandre.testegrx1.models;


public class Pessoa {
    private String nome;
    private String idade;
    private Integer id;

    public Pessoa(){ }

    public Pessoa(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getIdade(){
        return idade;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
}
