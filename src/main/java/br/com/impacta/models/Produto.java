package br.com.impacta.models;

public class Produto {

    //Atributos
    public int codigo;
    public String descricao;
    public double valor;

    //Método
    public String montarResumo(Produto produto){

        String resumo =  "codigo: " + produto.codigo + ", descricao: " + produto.descricao + ", valor: " + produto.valor;

        return resumo;
    }
}
