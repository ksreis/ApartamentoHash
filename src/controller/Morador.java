package controller;

import java.util.LinkedList;

public class Morador {
    private int numeroApartamento;
    private String nome;
    private String modeloCarro;
    private String corPlacaCarro;

    public Morador(int numeroApartamento, String nome, String modeloCarro, String corPlacaCarro) {
        this.numeroApartamento = numeroApartamento;
        this.nome = nome;
        this.modeloCarro = modeloCarro;
        this.corPlacaCarro = corPlacaCarro;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public String getNome() {
        return nome;
    }

    // getters e setters para as outras propriedades...
}