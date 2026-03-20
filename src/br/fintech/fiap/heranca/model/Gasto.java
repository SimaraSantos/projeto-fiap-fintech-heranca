package br.fintech.fiap.heranca.model;

import java.time.LocalDate;

public class Gasto extends MovimentacaoFinanceira {


    //Atributos
    private String metodoPagamento;
    private String categoria;

    //Construtor vazio
    public Gasto() {
        super();
    }

    //Construtor com todos os parâmetros
    public Gasto(int id, LocalDate data, double valor, String descricao, String metodoPagamento, String categoria) {
        super(id, data, valor, descricao);
        this.metodoPagamento = metodoPagamento;
        this.categoria = categoria;
    }


    //Metodos
    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
