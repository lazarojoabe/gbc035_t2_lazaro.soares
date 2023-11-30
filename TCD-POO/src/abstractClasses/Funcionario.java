package abstractClasses;

import interfaces.Salario;
public abstract class Funcionario implements Salario {
    protected String nome;
    protected String cpf;
    protected String estadoCivil;
    protected String rg;
    protected String endereco;
    protected String dataAdmissao;
    protected String numCateiraTrabalho;
    protected double salario;

    public Funcionario(){}
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        if (validarCPF(cpf)){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido.");
        }
    }
    public Funcionario(String nome, String cpf, String estadoCivil, String rg, String endereco, String dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.rg = rg;
        this.endereco = endereco;
        this.dataAdmissao = dataAdmissao;
    }
    public abstract void calcSalario();
    public String getNome() { return nome; }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNumCateiraTrabalho() {
        return numCateiraTrabalho;
    }

    public void setNumCateiraTrabalho(String numCateiraTrabalho) {
        this.numCateiraTrabalho = numCateiraTrabalho;
    }

    public boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }

        // Verifica se os dígitos calculados correspondem aos dígitos originais
        return digito1 == Integer.parseInt(String.valueOf(cpf.charAt(9))) &&
                digito2 == Integer.parseInt(String.valueOf(cpf.charAt(10)));
    }

    public double getSalario() {
        return salario;
    }
}
