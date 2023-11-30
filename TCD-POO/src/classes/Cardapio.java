package classes;

import abstractClasses.Item;
import enumClasses.TipoEmbalagem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Cardapio {

  private ArrayList<Item> cardapio = new ArrayList<Item>();
  private ArrayList<PratoPrincipal> pratosPrincipais = new ArrayList<PratoPrincipal>();
  private ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
  private ArrayList<Sobremesa> sobremesas = new ArrayList<Sobremesa>();


  //INGREDIENTES PRATO PRINCIPAL
  List<String> ingredientesLasanha = Arrays.asList("Massa", "Creme de Leite", "Mussarela", "Leite",
          "Óleo", "Alho", "Carne Moída", "Manteiga", "Presunto", "Molho de Tomate");
  List<String> ingredientesJantinha = Arrays.asList("Arroz", "Feijão", "Vinagrete", "Mandioca",
          "Batata Frita", "Espeto Franbacon");
  List<String> ingredientesFileDeTilapia = Arrays.asList("Filé de Tilápia", "Limão", "Alface",
          "Molho Rosê", "Molho de Alho");
  List<String> ingredientesBatataFrita = Arrays.asList("Batata", "Óleo", "Molho de Alho", "Molho Rosê");
  List<String> ingredientesPastel = Arrays.asList("Pastel de Queijo", "Pastel de Carne", "Pastel de Frango", "Molho Rosê", "Molho de Alho");

  //INGREDIENTES SOBREMESA
  List<String> ingredientesMousse = Arrays.asList("Leite Condensado", "Suco de Maracujá",
          "Creme de Leite");

  //INSTÂNCIAS PRATO PRINCIPAL
  PratoPrincipal jantinha = new PratoPrincipal("Jantinha", "PRT00", 12.50f, 25f,
          ingredientesJantinha, "Jantinha com Espeto", 5);
  PratoPrincipal lasanha = new PratoPrincipal("Lasanha", "PRT01", 10f, 20f, ingredientesLasanha,
          "Lasanha de Carne", 15);
  PratoPrincipal fileDeTilapia = new PratoPrincipal("Filé de Tilápia", "PRT02", 20f, 57f,
          ingredientesFileDeTilapia, "Porção de Filé de Tilápia", 20);

  PratoPrincipal batataFrita = new PratoPrincipal("Batata Frita", "PRT03", 12f, 28f,
          ingredientesBatataFrita, "Porção de Batata Frita", 15);
  PratoPrincipal pastel = new PratoPrincipal("Mini Pastel", "PRT04", 15f, 36f, ingredientesPastel
          , "Porção de Mini Pastel Misto", 15);
  //INSTÂNCIAS BEBIDA
  Bebida refrigerante = new Bebida("CocaCola", "BBD00", 2f, 6f, 310, TipoEmbalagem.LATA);
  Bebida sucoLaranja = new Bebida("Suco de Laranja", "BBD01", 5f, 18f, 500,
          TipoEmbalagem.GARRAFAVIDRO);
  Bebida cerveja = new Bebida("Cerveja", "BBD02", 5f, 12f, 600, TipoEmbalagem.GARRAFAVIDRO);
  Bebida caipirinha = new Bebida("Caipirinha", "BBD03", 3.60f, 10.5f, 300,
          TipoEmbalagem.GARRAFAVIDRO);

  //INSTÂNCIAS SOBREMESA
  Sobremesa mousseMaracuja = new Sobremesa("Mousse de Maracujá", "SBM00", 5f, 10f,
          ingredientesMousse, "Mousse de maracujá delicioso.", 15, 400);

  public Cardapio() {
    pratosPrincipais.add(jantinha);
    pratosPrincipais.add(lasanha);
    pratosPrincipais.add(fileDeTilapia);
    pratosPrincipais.add(batataFrita);
    pratosPrincipais.add(pastel);

    bebidas.add(refrigerante);
    bebidas.add(sucoLaranja);
    bebidas.add(cerveja);
    bebidas.add(caipirinha);

    sobremesas.add(mousseMaracuja);

    cardapio.addAll(pratosPrincipais);
    cardapio.addAll(bebidas);
    cardapio.addAll(sobremesas);
  }

  public ArrayList getCardapio() {
    return cardapio;
  }

  public void exibir() {
    int tamanhoMinimo = 20;

    // Usando String.format()
    String formato = "%-" + tamanhoMinimo + "s";

    System.out.println("=======================================");
    System.out.println("                CARDÁPIO");
    System.out.println("=======================================");
    System.out.println("PRATOS PRINCIPAIS");
    for (PratoPrincipal prato : pratosPrincipais) {
      String resultado = String.format(formato, prato.getNome());
      System.out.println(prato.getId() + " - " + resultado + "R$" + prato.getPrecoUnitario());
    }
    System.out.println("\nBEBIDAS");
    for (Bebida bebida : bebidas) {
      String resultado = String.format(formato, bebida.getNome());
      System.out.println(bebida.getId() + " - " + resultado + "R$" + bebida.getPrecoUnitario());
    }
    System.out.println("\nSOBREMESAS");
    for (Sobremesa sobremesa : sobremesas) {
      String resultado = String.format(formato, sobremesa.getNome());
      System.out.println(sobremesa.getId() + " - " + resultado + "R$" + sobremesa.getPrecoUnitario());
    }
    System.out.println("=======================================");
  }

  //Verifica se o prato, bebida ou sobremesa existe no sistema
  public boolean verificaPrato(String idPrato) {
    for (Item i : cardapio) {
      if (i.getId().compareTo(idPrato) == 0) {
        return true;
      }
    }
    return false;
  }

  public Item getItemByID(String id) {
    if (verificaPrato(id)) {
      for (Item i : cardapio) {
        if (i.getId().compareTo(id) == 0) {
          return i;
        }
      }
    }
    return null;
  }
}
