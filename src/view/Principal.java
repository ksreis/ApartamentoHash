package view;

import java.util.LinkedList;
import controller.Morador;
import controller.TabelaEspalhamento;

public class Principal {
    public static void main(String[] args) {
        TabelaEspalhamento tabela = new TabelaEspalhamento();


        Morador morador1 = new Morador(101, "João", "Fiat", "Prata");
        Morador morador2 = new Morador(201, "Maria", "Ford", "Vermelho");
        Morador morador3 = new Morador(701, "Pedro", "Chevrolet", "Azul");

        tabela.cadastrarMorador(morador1);
        tabela.cadastrarMorador(morador2);
        tabela.cadastrarMorador(morador3);

        LinkedList<Morador> moradoresAndar201 = tabela.listarMoradoresAndar(201);
        System.out.println("Moradores do 2º andar:");
        for (Morador morador : moradoresAndar201) {
            System.out.println(morador.getNome());
        }

        Morador moradorBuscado = tabela.buscarMorador(701);
        System.out.println("Morador do apartamento 701: " + moradorBuscado.getNome());

        tabela.excluirMorador(101);
    }
}