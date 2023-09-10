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
        /*Esse é um exemplo de Agregação. A classe musico faz parte da orquestra.
        * Caso a classe Musico seja destruída, a Orquestra não poderá existir - pois uma orquestra
        * é composta por músicos. A recíproca não é verdadeira - caso a classe Orquestra seja destruída,
        * a classe Musico não será afetada.*/
        Orquestra oq = new Orquestra(3, "Paulo Caligopoulos");
        oq.adcionarMusicos();
        oq.mostrarInfo();
    }    public static void main(String[] args) {
        //ex01();
        ex02();
    }
}
