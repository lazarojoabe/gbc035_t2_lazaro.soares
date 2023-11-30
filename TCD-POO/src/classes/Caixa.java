package classes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Caixa {

  public void verificaDatasPedidos(Pedido pedido) {
    try {
      String dateString = pedido.getDataRealizacao();
      // Formatador de data para o padrão especificado
      DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      // Converter a string para um objeto LocalDate
      LocalDate localDate = LocalDate.parse(dateString, dateFormatter);
      // Extrair o mês do objeto LocalDate
      String monthAndYear = localDate.getMonthValue() + "/" + localDate.getYear();

      File file = new File("pagamentos.txt");
      int lineNumber = 0;
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        lineNumber++;
        String line = scanner.nextLine();
        if (!line.contains(monthAndYear)) {
          removerRegistroPorLinha(lineNumber);
          verificaDatasPedidos(pedido);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void registrarPagamento(Pedido pedido) {
    try {
      String texto = "Data de Realização: " + pedido.getDataRealizacao() + " / Hora de Pagamento:" +
              " " + pedido.getHoraPagamento() + " / Valor total: " + pedido.getValorTotal();
      File file = new File("pagamentos.txt");

      //Se arquivo pagamentos.txt não existe...
      if (!file.exists()) {
        file.createNewFile();
      }

      FileWriter fw = new FileWriter(file, true);
      BufferedWriter escritor = new BufferedWriter(fw);

      escritor.write(texto);
      escritor.newLine();
      escritor.flush();
      escritor.close();

      verificaDatasPedidos(pedido);
      Restaurante.qtdTotalPedidos += 1;
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void removerRegistroPorLinha(int linha) {
    String arquivoOrg = "pagamentos.txt";
    String arquivoTemp = "pagamentos_temp.txt";
    try {
      // Criar leitor de arquivo
      BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoOrg));
      // Criar escritor de arquivo
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoTemp));

      // Contador para acompanhar o número da linha
      int lineNumber = 1;

      // Ler o arquivo linha por linha e gravar no novo arquivo, excluindo a linha desejada
      String currentLine;
      while ((currentLine = bufferedReader.readLine()) != null) {
        // Se a linha atual não for a linha a ser removida, gravar no novo arquivo
        if (lineNumber != linha) {
          bufferedWriter.write(currentLine);
          bufferedWriter.newLine(); // Adicionar uma nova linha
        }
        lineNumber++;
      }
      bufferedReader.close();
      bufferedWriter.close();

      //Limpar arquivo original
      try {
        // Criar um FileWriter em modo de escrita (isso limpará o conteúdo do arquivo)
        FileWriter fileWriter = new FileWriter(arquivoOrg);

        // Fechar o FileWriter para concluir a limpeza
        fileWriter.close();
        System.out.println("Conteúdo do arquivo limpo com sucesso.");
      } catch (IOException e) {
        // Tratar exceção, se houver
        e.printStackTrace();
      }

      // Criar leitor de arquivo
      BufferedReader newBufferedReader = new BufferedReader(new FileReader(arquivoTemp));

      // Criar escritor de arquivo
      BufferedWriter newBufferedWriter = new BufferedWriter(new FileWriter(arquivoOrg));
      // Ler o arquivo temporário linha por linha e gravar no arquivo original
      lineNumber = 0;
      while ((currentLine = newBufferedReader.readLine()) != null) {
        lineNumber++;
        newBufferedWriter.write(currentLine);
        newBufferedWriter.newLine(); // Adicionar uma nova linha
      }

      newBufferedWriter.close();
      newBufferedReader.close();

      // Remover arquivo temporário
      Path path = Paths.get(arquivoTemp);
      try {
        // Excluir o arquivo
        Files.delete(path);
        System.out.println("Arquivo excluído com sucesso.");
      } catch (IOException e) {
        // Tratar exceção, se houver
        System.err.println("Erro ao excluir o arquivo: " + e.getMessage());
      }

    } catch (IOException e) {
      // Tratar exceção, se houver
      e.printStackTrace();
    }

    Restaurante.qtdTotalPedidos -= 1;
  }

  public void receberPagamento(Mesa mesa, Pedido pedido) {
    Scanner sc = new Scanner(System.in);
    int opcaoPagamento;
    double pagamento;

    System.out.println("SELECIONE UMA FORMA DE PAGAMENTO: ");
    do {
      System.out.println("[1] Dinheiro\n[2] Cartão de Crédito\n[3] PIX");
      opcaoPagamento = sc.nextInt();
      if (opcaoPagamento > 3 || opcaoPagamento < 1) {
        System.out.println("INSIRA UMA OPÇÃO VÁLIDA!!");
      }
    } while (opcaoPagamento > 3 || opcaoPagamento < 1);
    System.out.println("VALOR TOTAL: " + pedido.getValorTotal());
    switch (opcaoPagamento) {
      case 1:
        System.out.println("Você escolheu pagar com dinheiro. Qual o valo?: ");
        do {
          pagamento = sc.nextDouble();
          if (pagamento < pedido.getValorTotal()) {
            System.out.println("Senhor(a), o valor informado não é suficiente para pagar a conta. Por favor, insira novamente");
          }
        } while (pagamento < pedido.getValorTotal());

        double troco = pagamento - pedido.getValorTotal();
        if (troco > 0) {
          System.out.println("Aqui está o seu troco: " + troco);
        }
        pedido.setFormaPagamento("Dinheiro");
        break;
      case 2:
        System.out.println("Insira o seu cartão: ");
        pedido.setFormaPagamento("Cartão de crédito");
        break;
      case 3:
        System.out.println("A nossa chave email é: javaliMelhorRestaurante@gmail.com");

        System.out.println("Comprovante de pagamento: ");
        System.out.println("\n---COMPROVANTE DE PAGAMENTO PIX---");
        System.out.println("|PAGAMENTO REALIZADO A: JAVALI RESTAURANT|");
        System.out.println("|VALOR: " + pedido.getValorTotal() + "   |");
        pedido.setHoraPagamento(new Date());
        System.out.println("|HORA DE PAGAMENTO: " + pedido.getHoraPagamento() + "  |\n");
        pedido.setFormaPagamento("PIX");
        break;
      default:
        break;
    }

    pedido.setPago(true);
    pedido.setHoraPagamento(new Date());
    mesa.setPedidoRealizado(false);
    System.out.println("Pagamento realizado com sucesso!");

    //Registrar pagamento no arquivo
    registrarPagamento(pedido);

  }

}
