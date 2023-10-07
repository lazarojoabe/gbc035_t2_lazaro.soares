public class Main {

    public static void main(String[] args) {
        /*
        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        e.print();


        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());

        ep.print();
        System.out.println("Formação prévia: " + ep.getFormacao());

        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());
        */


        // casos com polimorfismo
        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        Universidade u = new Universidade("UFU", "18/09/1980");
        Estudante[] vet = new Estudante[5];
        vet[0] = e2;
        vet[1] = eg2;
        vet[2] = ep2;
        vet[3] = epm2;
        vet[4] = epd2;
        //u.setAlunos(vet);
        //u.mostrarQtdAlunos();
        //u.mostarInfoAlunos();

        int qtdAlunoPos = 0;
        for(Estudante i : vet){
            if(i instanceof EstudantePosGrad)
                qtdAlunoPos++;
        }
        EstudantePosGrad[] newVet = new EstudantePosGrad[qtdAlunoPos];

        for(int i = 0, k = 0; i < vet.length; i++){
            if(vet[i] instanceof EstudantePosGrad){
                newVet[k] = new EstudantePosGrad(vet[i].getNome(), vet[i].getEndereco(), ((EstudantePosGrad) vet[i]).getFormacao(), ((EstudantePosGrad) vet[i]).getLinhaDePesquisa());
                k++;
            }
        }
        u.setAlunos(newVet);
        /* RESPOSTA E): Não é possível utilizar o print(booleana) tendo como base um vetor
           da classe Estudante, pois esse método é fruto de uma sobrecarga que ocorre em classes
           especializadas em relação a Estudante.
                Para que o uso seja possível é necessário fazer a sobrecarga do método print()
                na própria classe Estudante, gerando o print(boolean a). A partir disso,
                deve ser feito a sobrescrita desse método - print(boolean a) - nas classes
                especializadas para que seja mostrado todos os atributos dessas classes
        */
        /*for(EstudantePosGrad i : newVet){
            System.out.println("Nome: " + i.getNome());
            System.out.println("Endereco: " + i.getEndereco());
            System.out.println("Formação: " + i.getFormacao());
            System.out.println("Linha de Pesquisa: " + i.getLinhaDePesquisa());
            if(i instanceof EstudanteMestrado){
                System.out.println("Tipo: " + ((EstudanteMestrado) i).getTipo());
                System.out.println("Titulo Dissertação: " + ((EstudanteMestrado)i).getTituloDissertacao());
            } else if(i instanceof EstudanteDoutorado){
                System.out.println("Titulo Tese: " + ((EstudanteDoutorado)i).getTituloTese());
            }
        }
        */
        ((EstudanteDoutorado) epd2).print(true);
        // exemplo de uso com vetor e com CAST
        /*Estudante[] ev = new Estudante[4];
        ev[0] = eg;
        eg.print();
        eg.getTituloTCC();
        ev[0].print();;
        String x = ((EstudanteGraduacao) ev[0]).getTituloTCC();
        String x2 = ((EstudantePosGrad) ev[0]).getFormacao();



        e2.print();
        eg2.print();
        epd2.print();
        ep2.print();
        epd2.print();
     //   EstudanteDoutorado epd3;
      //  epd3 = (EstudanteDoutorado)epd2;
       // System.out.println(epd3.getTituloTese());
       // System.out.println(((EstudanteDoutorado)epd2).getTituloTese());

/*
        eg2.print();
        System.out.println(eg2.getTituloTCC());

        ep2.print();
        System.out.println(ep2.getFormacao());

        epm2.print();
        System.out.println(epm2.getTituloDissertacao());

*/
        /*
        Estudante e2 = new Estudante();
        Estudante eg2 = new EstudanteGraduacao();
        Estudante ep2 = new EstudantePosGrad();
        Estudante epm2 = new EstudanteMestrado();
        Estudante epd2 = new EstudanteDoutorado();

        //EstudantePosGrad e3 = new Estudante();
        //EstudantePosGrad eg3 = new EstudanteGraduacao();
        */

        // polimorfismo com pós-graduação
        // construtor incompleto
        /*
        EstudantePosGrad ep3 = new EstudantePosGrad();
        EstudantePosGrad epm3 = new EstudanteMestrado();
        EstudantePosGrad epd3 = new EstudanteDoutorado();
        */



    }
}
