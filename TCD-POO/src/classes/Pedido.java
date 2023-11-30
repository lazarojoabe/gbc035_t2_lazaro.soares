package classes;
import abstractClasses.Item;

import java.text.SimpleDateFormat;
import java.util.*;

public class Pedido{
    private ArrayList<Item> itens;
    private String dataRealizacao;
    private String horaRegistro;
    private String horaPagamento;
    private float valorTotal;
    private String formaPagamento;
    private Garcom garcom;
    private Cozinheiro cozinheiro;
    private Mesa mesa;
    private boolean pago;

    public Pedido(){
        Date dataHoraAtual = new Date();
        this.dataRealizacao = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        this.horaRegistro = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        itens = new ArrayList<>();
        pago = false;
    }
    public Pedido(Date dataRealizacao, Garcom garcom, Cozinheiro cozinheiro) {
        this.dataRealizacao = new SimpleDateFormat("dd/MM/yyyy").format(dataRealizacao);
        this.horaRegistro = new SimpleDateFormat("HH:mm:ss").format(dataRealizacao);
        this.garcom = garcom;
        this.cozinheiro = cozinheiro;
    }

    public Pedido(Date dataRealizacao, Garcom garcom, Cozinheiro cozinheiro, ArrayList<Item> itens) {
        this.dataRealizacao = new SimpleDateFormat("dd/MM/yyyy").format(dataRealizacao);
        this.horaRegistro = new SimpleDateFormat("HH:mm:ss").format(dataRealizacao);
        this.garcom = garcom;
        this.cozinheiro = cozinheiro;
    }

    public void fazerPedido(Garcom garcom, Cozinheiro cozinheiro, ArrayList<Item> itensEscolhidos
            , Mesa mesa){
        Date dataHoraAtual = new Date();
        this.dataRealizacao = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        this.horaRegistro = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

        this.valorTotal = 0;
        this.garcom = garcom;
        this.cozinheiro = cozinheiro;
        this.mesa = mesa;

        itens.addAll(itensEscolhidos); //adiciona os itens escolhidos pelo usuario ao conjunto de itens do pedido
        mesa.setComandaItens(itens);
        for(Item i : itensEscolhidos){
            valorTotal += i.getPrecoUnitario();
        }
        mesa.setValorTotal(valorTotal);

        mesa.setPedidoRealizado(true);
        System.out.println("\n\nRESUMO DO PEDIDO:");
        mostrarPedido();
    }

    public void mostrarPedido(){
        int tamanhoMinimo = 20;

        // Usando String.format()
        String formato = "%-" + tamanhoMinimo + "s";
        String resultado;
        for (Item i: itens) {
            resultado = String.format(formato, i.getNome());
            System.out.println(resultado + "R$" + i.getPrecoUnitario());
        }
        resultado = String.format(formato, "Mesa:");
        System.out.println(resultado + mesa.getNumero());
        resultado = String.format(formato, "Valor total: ");
        System.out.println(resultado + "R$" + valorTotal);
        resultado = String.format(formato, "Data do pedido: ");
        System.out.println(resultado + dataRealizacao);
        resultado = String.format(formato, "Horário do pedido: ");
        System.out.println(resultado + horaRegistro);
    }
    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = new SimpleDateFormat("dd/MM/yyyy").format(dataRealizacao);
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(Date horaRegistro) {
        this.horaRegistro = new SimpleDateFormat("HH:mm:ss").format(horaRegistro);
    }

    public String getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(Date horaPagamento) {
        this.horaPagamento = new SimpleDateFormat("HH:mm:ss").format(horaPagamento);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public Cozinheiro getCozinheiro() {
        return cozinheiro;
    }

    public void setCozinheiro(Cozinheiro cozinheiro) {
        this.cozinheiro = cozinheiro;
    }
}
