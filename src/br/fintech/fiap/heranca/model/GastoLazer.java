package br.fintech.fiap.heranca.model;

import java.time.LocalDate;

public class GastoLazer extends Gasto {

    // Atributo específico desta classe
    private String localLazer;

    // Construtor Vazio
    public GastoLazer() {
        super();
    }

    // Construtor com Parâmetros
    public GastoLazer(int id, LocalDate data, double valor, String descricao, String metodoPagamento, String categoria, String localLazer) {
        super(id, data, valor, descricao, metodoPagamento, categoria);
        this.localLazer = localLazer;
    }

    // Aplicando o @Override no método mostrarDados
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        // Adiciona a informação específica de Lazer
        System.out.println("Local do Lazer: " + this.localLazer);
        System.out.println("Status: Diversão!");
    }

    // Metodos Getter e Setter
    public String getLocalLazer() {
        return localLazer;
    }

    public void setLocalLazer(String localLazer) {
        this.localLazer = localLazer;
    }
}



