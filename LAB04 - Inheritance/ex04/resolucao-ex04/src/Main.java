public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1("Ana", "Bianca", "Carlos");
        //c1.mostrarAtributos();
        System.out.println("Atributos da C1: ");
        c1.mostrarAtributosSuper();
        C2 c2 = new C2("Ana", "Bianca", "Carlos","Daniel", "Erick",
                "Fatima");
        System.out.println("Atributos da C2: ");
        //c2.mostrarAtributosC2();
        c2.mostrarAtributosSuper();

        C3 c3 = new C3("Ana", "Bianca", "Carlos","Daniel", "Erick",
                "Fatima", "Gustavo", "Henrique", "Igor");
        //c3.mostrarAtributosC3();
        System.out.println("Atributos da C3: ");
        c3.mostrarAtributosSuper();


    }
}