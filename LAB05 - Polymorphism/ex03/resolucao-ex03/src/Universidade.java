public class Universidade {
    private String nome;
    private String dataFundacao;
    private Estudante[] alunos;

    public Universidade(String nome, String dataFundacao){
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        alunos = new Estudante[100];
    }

    public void mostrarQtdAlunos(){
        int qtdGraduacao = 0, qtdMestrado = 0, qtdDoutorado = 0;
        for (Estudante i : alunos){
            if(i instanceof EstudanteGraduacao){
                qtdGraduacao++;
            } else if(i instanceof EstudantePosGrad){
                if(i instanceof EstudanteMestrado){
                    qtdMestrado++;
                } else if (i instanceof  EstudanteDoutorado){
                    qtdDoutorado++;
                }
            }
        }
        System.out.printf("Há %d estudantes de Graduação, %d de mestrado, e %d de Doutorado\n",
                qtdGraduacao, qtdMestrado, qtdDoutorado);
    }


    public void mostarInfoAlunos(){
        for(Estudante i : alunos){
            System.out.println("Nome: " + i.getNome());
            if(i instanceof EstudanteDoutorado){
                System.out.printf("%s eh aluno de doutorado, e o titulo da sua" +
                        "linha de pesquisa eh %s", i.getNome(), ((EstudanteDoutorado) i).getTituloTese());
            }
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Estudante[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Estudante[] alunos) {
        this.alunos = alunos;
    }
}
