import sun.java2d.loops.ProcessPath;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
        Deque<Estudante> deck = new ArrayDeque<>();
        deck.addFirst(e);
        deck.addFirst(ep);
        deck.removeFirst();
        deck.addLast(epd);
        for(Estudante i : deck){
            i.print();
        }

        Deque<Estudante> deck2 = new ArrayDeque<>();

        try {
            deck2.getFirst();
            deck2.removeFirst();
        } catch (NoSuchElementException exception){
            exception.getMessage();
            System.out.println("ERRO!O deque está vazio!");
        }
    }
}
