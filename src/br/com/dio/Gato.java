package br.com.dio;

import java.io.Serializable;

public class Gato implements Serializable{

    private static final long serialVersionUID = 2L;
    private String nome;
    private Integer idade;
    private String cor;
    private boolean castrado;
    private transient boolean ronrona;


    public Gato(String nome, Integer idade, String cor, boolean castrado, boolean ronrona) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.castrado = castrado;
        this.ronrona = ronrona;
    }

    public Gato() {
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public boolean isRonrona() {
        return ronrona;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", castrado=" + castrado +
                ", ronrona=" + ronrona +
                '}';
    }
}
