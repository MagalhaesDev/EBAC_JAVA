package br.com.magalhaesdev.generics;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeCarros {
    private List<Carro> listaDeCarros;

    public GerenciadorDeCarros() {
        listaDeCarros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        listaDeCarros.add(carro);
    }

    public void exibirTodosOsCarros() {
        for (Carro carro : listaDeCarros) {
            carro.exibirDetalhes();
        }
    }

    public static void main(String[] args) {
        GerenciadorDeCarros gerenciador = new GerenciadorDeCarros();

        Honda hondaCivic = new Honda("Civic", 2020);
        Toyota toyotaCorolla = new Toyota("Corolla", 2021);

        gerenciador.adicionarCarro(hondaCivic);
        gerenciador.adicionarCarro(toyotaCorolla);

        gerenciador.exibirTodosOsCarros();
    }
}

