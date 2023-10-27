public class Main {
    public static void main(String[] args) {
        Cliente[] c = new Cliente[5];
        Produto[] p = new Produto[5];
        Servico[] s = new Servico[5];
        Classificador classf = new Classificador();

        c[0] = new Cliente("Eddy", "12345", "11/09/1981");
        c[1] = new Cliente("Bernasdeschi", "678910", "29/10/2001");
        c[2] = new Cliente("Clodoaldo", "111213", "18/11/2007");
        c[3] = new Cliente("Elianosvalda", "555555555", "30/12/1997");
        c[4] = new Cliente("Antetokounmpo", "666666666", "25/11/1987");

        //Ordena pelo tamanho do nome (em ordem crescente)
        classf.ordena(c);
        for(Cliente k : c){
            System.out.println(k.getNome());
        }

        p[0] = new Produto("Bolacha", 3, "Alimento");
        p[1] = new Produto("Vela", 2, "Decoração");
        p[2] = new Produto("Escova de dente", 1, "Higiene pessoal");
        p[3] = new Produto("Camiseta", 4, "Moda");
        p[4] = new Produto("Bola de Volei", 5, "Brinquedo");

        //Ordena segundo o codigo do produto (ordem crescente)
        classf.ordena(p);

        for(Produto i : p){
            System.out.printf("%s, %d\n", i.getNome(), i.getCodigo());
        }

        s[0] = new Servico("Instalacao de internet", 200, "Clientes da empresa", 1);
        s[1] = new Servico("Colsulta", 500, "Doentes", 2);
        s[2] = new Servico("Viagem de Taxi", 30, "Passageiros", .5);
        s[3] = new Servico("Aula",100, "Alunos", 2);
        s[4] = new Servico("Consertar o encanamento", 150, "Moradores", .8);

        //ordenacao por preco (ordem crecente)
        classf.ordena(s);
        for(Servico i : s){
            System.out.printf("%s, %.2f\n", i.getNome(), i.getPreco());
        }
    }
}
