public class Classificador  {
    public void ordena(Classificavel[] a) {
        Classificavel elem, menor;
        int pos = 0;
        for (int i = 0; i < a.length - 1; i++) {
            elem = a[i];
            menor = a[i + 1];
            pos = i + 1;
            for (int j = i + 2; j < a.length; j++) {
                if (a[j].eMenorQue(menor) == 0) { // encontrando o menor elemento
                    menor = a[j];
                    pos = j;
                }
            }
            if (menor.eMenorQue(elem) == 0) { // troca
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    }
}