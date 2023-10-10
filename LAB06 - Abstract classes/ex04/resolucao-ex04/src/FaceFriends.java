import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, i = 0;
        Contato[] vet = new Contato[100];
        do {
            System.out.println("<< MENU >>");
            System.out.println("Selecione uma das opcoes abaixo: ");
            System.out.println("1-INSERIR CONTATO");
            System.out.println("2-IMPRIMIR TODOS OS CONTADOS");
            System.out.println("3-IMPRIMIR SOMENTE OS FAMILIARES");
            System.out.println("4-IMPRIMIR SOMENTE OS AMIGOS");
            System.out.println("5-IMPRIMIR SOMENTE OS COLEGAS DE TRABALHO");
            System.out.println("6-IMPRIMIR SOMENTE OS MELHORES AMIGOS, IRMAOS E COLEGAS ");
            System.out.println("7-IMPRIMIR SOMENTE OS DADOS DE UM INDICE ESPECIFICADO");
            System.out.println("0-SAIR");
            op = sc.nextInt();
            switch (op){
                case 1:
                    String tipo = " ";
                    System.out.println("Qual será o tipo? (Familia, Amigos, Trabalho): ");
                    sc.nextLine();
                    tipo = sc.nextLine();
                    String upperTipo = tipo.toUpperCase();
                    String nome, apelido, email, aniversario;
                    switch (upperTipo){
                        case "FAMILIA":
                            System.out.println("Insira o nome: ");
                            nome = sc.nextLine();
                            System.out.println("Insira o apelido: ");
                            apelido = sc.nextLine();
                            System.out.println("Insira o email: ");
                            email = sc.nextLine();
                            System.out.println("Insira o Aniversario: ");
                            aniversario = sc.nextLine();
                            System.out.println("Insira o grau de parentesco: ");
                            String parentesco = sc.nextLine();
                            vet[i] = new Familia(nome, apelido, email, aniversario, parentesco);
                            i++;
                            break;
                        case "AMIGOS":
                            System.out.println("Insira o nome: ");
                            nome = sc.nextLine();
                            System.out.println("Insira o apelido: ");
                            apelido = sc.nextLine();
                            System.out.println("Insira o email: ");
                            email = sc.nextLine();
                            System.out.println("Insira o Aniversario: ");
                            aniversario = sc.nextLine();
                            System.out.println("Insira o grau de amizade: ");
                            int grau = sc.nextInt();
                            vet[i] = new Amigos(nome, apelido, email, aniversario, grau);
                            i++;
                            break;
                        case "TRABALHO":
                            System.out.println("Insira o nome: ");
                            nome = sc.nextLine();
                            System.out.println("Insira o apelido: ");
                            apelido = sc.nextLine();
                            System.out.println("Insira o email: ");
                            email = sc.nextLine();
                            System.out.println("Insira o Aniversario: ");
                            aniversario = sc.nextLine();
                            System.out.println("Insira o tipo: ");
                            String tipoTrab = sc.nextLine();
                            vet[i] = new Trabalho(nome, apelido, email, aniversario, tipoTrab);
                            i++;
                            break;
                    }
                    break;
                case 2:
                    for(int j = 0; j < i; j++){
                        vet[j].imprimirContato();
                    }
                    break;
                case 3:
                    for(int j = 0; j < i; j++){
                        if(vet[j] instanceof Familia){
                            vet[j].imprimirContato();
                        }
                    }
                    break;
                case 4:
                    for(int j = 0; j < i; j++){
                        if(vet[j] instanceof Amigos){
                            vet[j].imprimirContato();
                        }
                    }
                    break;
                case 5:
                    for(int j = 0; j < i; j++){
                        if(vet[j] instanceof Trabalho){
                            vet[j].imprimirContato();
                        }
                    }
                    break;
                case 6:
                    for(int j = 0; j < i; j++){
                        if(vet[j] instanceof Amigos){
                            if(((Amigos) vet[j]).getGrau() == 1){
                                vet[j].imprimirContato();
                            }
                        }

                        if(vet[j] instanceof Familia){
                            if( ((Familia) vet[j]).getParentesco().equals("irmao")){
                                vet[j].imprimirContato();
                            }
                        }

                        if(vet[j] instanceof Trabalho){
                            if( ((Trabalho) vet[j]).getTipo().equals("colega")){
                                vet[j].imprimirContato();
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Insira o indice: ");
                    int indice = sc.nextInt();
                    if(indice >= 100 || indice  < 0){
                        System.out.println("Indice Invalido");
                    } else {
                        vet[indice].imprimirContato();
                    }
                    break;

            }
            if(op < 0 || op > 7){
                System.out.println("Insira um valor válido!");
            }
        }while (op != 0);
    }
}
