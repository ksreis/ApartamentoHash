package controller;

import java.util.LinkedList;

public class TabelaEspalhamento {
    private LinkedList<Morador>[] tabela;
    private static final int TAMANHO_TABELA = 10; // número de andares

    public TabelaEspalhamento() {
        tabela = new LinkedList[TAMANHO_TABELA];
        for (int i = 0; i < TAMANHO_TABELA; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int calcularHash(int numeroApartamento) {
        return numeroApartamento % TAMANHO_TABELA;
    }

    public void cadastrarMorador(Morador morador) {
        int hash = calcularHash(morador.getNumeroApartamento());
        tabela[hash].add(morador);
    }

    public void excluirMorador(int numeroApartamento) {
        int hash = calcularHash(numeroApartamento);
        LinkedList<Morador> listaMoradores = tabela[hash];
        for (Morador morador : listaMoradores) {
            if (morador.getNumeroApartamento() == numeroApartamento) {
                listaMoradores.remove(morador);
                break;
            }
        }
    }

    public LinkedList<Morador> listarMoradoresAndar(int numeroAndar) {
        int hash = calcularHash(numeroAndar);
        return tabela[hash];
    }

    public Morador buscarMorador(int numeroApartamento) {
        int hash = calcularHash(numeroApartamento);
        LinkedList<Morador> listaMoradores = tabela[hash];
        for (Morador morador : listaMoradores) {
            if (morador.getNumeroApartamento() == numeroApartamento) {
                return morador;
            }
        }
        return null;
    }
}

