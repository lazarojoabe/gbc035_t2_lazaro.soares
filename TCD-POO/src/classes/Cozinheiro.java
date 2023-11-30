package classes;

import abstractClasses.Funcionario;
import abstractClasses.Item;

import java.util.ArrayList;
import java.util.List;

public class Cozinheiro extends Funcionario {
    private List<Item> comidasQueFaz;
    private String carteiraDeTrabalho;
    private int qtdPratosPrincipaisPreparados;
    private int qtdSobremesasPreparadas;
    private static double valorPagoPratoPrincipal = 10;
    private static double valorPagoSobremesa = 5;

    public Cozinheiro(String nome, String cpf, List<Item> pratos, String carteiraDeTrabalho, String dataAdmissao,
                      String numCarteiraTrabalho){
        super(nome, cpf);
        this.carteiraDeTrabalho = carteiraDeTrabalho;
        setDataAdmissao(dataAdmissao);
        setNumCateiraTrabalho(numCarteiraTrabalho);
        comidasQueFaz = new ArrayList<>();
        comidasQueFaz.addAll(pratos);
    }

    public int getQtdSobremesasPreparadas() {
        return qtdSobremesasPreparadas;
    }

    public void setQtdSobremesasPreparadas(int qtdSobremesasPreparadas) {
        this.qtdSobremesasPreparadas = qtdSobremesasPreparadas;
    }

    public int getQtdPratosPrincipaisPreparados() {
        return qtdPratosPrincipaisPreparados;
    }

    public void setQtdPratosPrincipaisPreparados(int qtdPratosPrincipaisPreparados) {
        this.qtdPratosPrincipaisPreparados = qtdPratosPrincipaisPreparados;
    }

    public List<Item> getComidasQueFaz() {
        return comidasQueFaz;
    }

    public void calcSalario(){
        this.salario = (qtdPratosPrincipaisPreparados * valorPagoPratoPrincipal) + (qtdSobremesasPreparadas * valorPagoSobremesa);
    }
}
