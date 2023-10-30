public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joao", "111111111", 39000);
        try{
            f.aumentarSalario(-0.01);
        } catch (Excecao e){
            System.out.println(e.getMessage());
        }
        System.out.println(f.getSalario());
    }
}
