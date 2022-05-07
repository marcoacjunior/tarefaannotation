package br.com.marco.anotacao;


@AnotacaoTabela("NomeT")
public class ClassecomAnotacao {

    @AnotacaoTabela(value = "NomeT")
    private String nome;
}
