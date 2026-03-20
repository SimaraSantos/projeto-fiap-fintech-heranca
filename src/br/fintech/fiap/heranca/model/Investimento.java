package br.fintech.fiap.heranca.model;

import java.time.LocalDate;

public class Investimento extends MovimentacaoFinanceira {

    //Atributos
    private String tipo;
    private String categoria;

    //Construtor vazio
    public Investimento() {
        super();
    }

    //Construtor com todos os atributos
    public Investimento(int id, LocalDate data, double valor, String descricao, String tipo, String categoria) {
        super(id, data, valor, descricao);
        this.tipo = tipo;
        this.categoria = categoria;
    }

    //Metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
