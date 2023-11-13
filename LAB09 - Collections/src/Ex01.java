import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Ex01{
    public static void main(String[] args) {
        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        //Lista
        List<Estudante> lista = new ArrayList<>();
        lista.add(e);
        lista.add(eg);
        lista.add(ep);
        lista.add(epm);
        lista.add(epd);


        lista.remove(e);

        //Pilha
        Stack<Estudante> pilha = new Stack<>();
        pilha.push(e);
        pilha.push(eg);
        pilha.push(ep);
        pilha.push(epm);
        pilha.push(epd);


        pilha.pop();
        for(Estudante i : pilha){
            System.out.println(i.getNome());
        }
        lista.add(e);

        Collections.sort(lista);
        System.out.println("Após ordenar baseado na quantidade de letras do endereço");
        for (Estudante i : lista){
            i.print();
        }
    }
}
