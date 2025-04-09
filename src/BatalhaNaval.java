import java.util.Scanner;

public class BatalhaNaval {
  public static void main(String[] args) {

    String[][] tabuleiro = new String[5][5]; // Array multidimensional para representar o tabuleiro que guarda as coordenadas do navio

    String[][] tabuleiroJogador = new String[5][5]; // Array multidimensional para exibir ao jogador conforme ele tenta acertar o navio
                                                   
    int tentativas = 10;
    int navios = 3;

    Scanner scanner = new Scanner(System.in); // Pedindo a posição dos navios via scanner

    System.out.println("Digite as posições dos navios (0-4):");
    System.out.println("Navio 1:");

    int colunaNavio1 = scanner.nextInt();
    int linhaNavio1 = scanner.nextInt();

    System.out.println("Navio 2:");

    int colunaNavio2 = scanner.nextInt();
    int linhaNavio2 = scanner.nextInt();

    System.out.println("Navio 3:");

    int colunaNavio3 = scanner.nextInt();
    int linhaNavio3 = scanner.nextInt();

    // Preencher o tabuleiro com ~ para representar a agua
    for (int i = 0; i < tabuleiro.length; i++) {
      for (int j = 0; j < tabuleiro.length; j++) {
        tabuleiro[i][j] = "~";
      }
    }

    // Preencher tabueleiro do jogador com ~ para representar a agua
    for (int i = 0; i < tabuleiroJogador.length; i++) {
      for (int j = 0; j < tabuleiroJogador.length; j++) {
        tabuleiroJogador[i][j] = "~";
      }
    }
    // Preenchendo o tabuleiro com as posições inseridas pelo usuario
    tabuleiro[colunaNavio1][linhaNavio1] = "N";
    tabuleiro[colunaNavio2][linhaNavio2] = "N";
    tabuleiro[colunaNavio3][linhaNavio3] = "N";

    System.out.println("Bem-vindo ao jogo de Batalha Naval!");
    System.out.printf("Você tem %d tentativas para afundar 3 navios.", tentativas);

    while (tentativas > 0 && navios > 0) {
      // Exibir tabuleiro
      System.out.println("\n  0 1 2 3 4");
      for (int i = 0; i < tabuleiroJogador.length; i++) {
        System.out.print(i + " ");
        for (int j = 0; j < tabuleiroJogador[i].length; j++) {
          System.out.print(tabuleiroJogador[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println("Tentativas restantes: " + tentativas);
      System.out.print("Digite a linha e a coluna (0-4): ");
      
      int linha = scanner.nextInt();
      int coluna = scanner.nextInt();

      if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
        System.out.println("Posição inválida. Tente novamente.");
        continue;
      }

      if (tabuleiro[linha][coluna] == "X") {
        System.out.println("Você já tentou essa posição. Tente novamente.");
        continue;
      } else if (tabuleiro[linha][coluna] == "N") {
        System.out.println("Você acertou um navio!");
        tabuleiro[linha][coluna] = "X";
        tabuleiroJogador[linha][coluna] = "X";
        navios--;
      } else {
        System.out.println("Você errou.");
        tabuleiro[linha][coluna] = "X";
      }

      tentativas--;
    }

    if (navios == 0) {
      System.out.println("Parabéns! Você afundou todos os navios.");
    } else {
      System.out.println("Você perdeu. Os navios sobreviveram.");
    }
    scanner.close();
  }
}