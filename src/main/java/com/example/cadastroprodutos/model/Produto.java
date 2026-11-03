package com.example.cadastroprodutos.model;
public class Produto {

    private String nome; // nome do produto
    private double preco; // preço em reais
    private String categoria; // ex: Eletrônico, Vestuário
    // Construtor vazio — obrigatório para o Thymeleaf funcionar


    //Adicione um quarto atributo ao produto, como "estoque" (int) ou "descricao"
    //(String). Atualize o formulário e a tabela.
    private int estoque;
    private String descricao;

    public Produto() {
    }
    // Getters e Setters — permitem ler e alterar os atributos
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria =
            categoria; }

//============================================================================
//Estoque e descrição
    public int getEstoque() {return estoque;}
    public void setEstoque(int estoque) {this.estoque = estoque;}


    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
}
