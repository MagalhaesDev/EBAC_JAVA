package br.com.magalhaesdev.generics;

public class Honda extends Carro {
    public Honda(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Honda " + getModelo() + " - Ano: " + getAno());
    }
}
