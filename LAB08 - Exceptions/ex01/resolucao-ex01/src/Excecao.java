public class Excecao extends IllegalArgumentException{
    public void valorNegativo(){
        System.out.println("Valor invalido de salario!");
    }

    public void maiorQueTeto(){
        System.out.println("O valor ultrapassa o teto!");
    }
}
