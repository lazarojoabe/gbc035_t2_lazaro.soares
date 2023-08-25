public class Figurinha {
        private String nome;
        private String data_nasc;
        private float peso;
        private float altura;
        private String pais;
        private String posicao;

        public Figurinha(String pais){
            this.pais = pais;
            nome = " ";
            peso = 0.0f;
            altura = 0.0f;
            posicao = " ";
            data_nasc = " /  /    ";
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setAltura(float altura) {
            this.altura = altura;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public void setPeso(float peso) {
            this.peso = peso;
        }

        public void setPosicao(String posicao) {
            this.posicao = posicao;
        }

        public void setData_nasc(String data_nasc) {
            this.data_nasc = data_nasc;
        }

        public void mostrarInfo(){
            System.out.println("Nome: " + nome);
            System.out.println("Nascimento: " + data_nasc);
            System.out.println("Altura: " + altura);
            System.out.println("Peso: " + peso);
            System.out.println("Posição: " + posicao);
            System.out.println("País: " + pais);
        }
}
