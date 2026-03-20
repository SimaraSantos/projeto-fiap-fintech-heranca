package br.fintech.fiap.heranca.model;

import java.time.LocalDate;

//Essa é a super classe e ela é abstract porque serve somente de base para outras classes, abstract impede que outra classe dessa seja criada ou instanciada.
public  abstract class MovimentacaoFinanceira {

    //Atributos
    private int id;
    private LocalDate data;
    private double valor;
    private String descricao;


    //Construtor vazio
    public MovimentacaoFinanceira() {
    }

    //Construtor com todos os atributops
    public MovimentacaoFinanceira(int id, LocalDate data, double valor, String descricao) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    //Metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método base para sobrescrever pelas subclasses
    public void mostrarDados() {
        System.out.println("--- Dados da Movimentação ---");
        System.out.println("ID: " + this.id);
        System.out.println("Data: " + this.data);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Descrição: " + this.descricao);
    }

}
