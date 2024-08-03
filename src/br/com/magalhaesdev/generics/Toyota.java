package br.com.magalhaesdev.generics;

public class Toyota extends Carro {
    public Toyota(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Toyota " + getModelo() + " - Ano: " + getAno());
    }
}
