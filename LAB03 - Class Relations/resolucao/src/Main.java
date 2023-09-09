public class Main {
    public static void ex01(){
        /*Exemplo de Associação, pois a classe Pessoa USA a classe Cidade.
        As duas classes são independentes; caso uma seja destruída, a outra
        não será afetada*/
        Pessoa p = new Pessoa("Lazaro", 'M', 19, "Janaúba");
        p.getInfo();
    }
    public static void ex02()
    {
        Orquestra oq = new Orquestra(3, "Paulo Caligopoulos");
        //oq.adcionarMusico();
        oq.mostrarInfo();
    }    public static void main(String[] args) {
        //ex01();
        ex02();
    }
}
