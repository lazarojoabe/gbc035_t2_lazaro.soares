public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    @Override
    public void print(boolean mesmaLiha){
        if(mesmaLiha){
            print();
        } else {
            System.out.println("Nome: " + getNome());
            System.out.println("Enderco: " + getEndereco());
            System.out.println("Título tese: " + getTituloTese());
            System.out.println("Formação: " + getFormacao());
            System.out.println("Linha de pesquisa: " + getLinhaDePesquisa());
            System.out.println("Titulo da Tese: " + getTituloTese());
        }
    }
    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}
