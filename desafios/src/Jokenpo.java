import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Variáveis utilizadas
        int x, result, ptsJogador = 0, ptsMaquina = 0, empate = 0, loop = 0; // 'x' para indicar a opção e 'result' pra
                                                                             // máquina
        // randomizar a opção dela
        Random rd = new Random(); // 'rd' para fazer a geração dos numeros randomicos

        while (loop == 0) {

            System.out.println("Jogador, selecione as opções abaixo: ");
            System.out.println("1 - Papel | 2 - Pedra | 3 - Tesoura ");
            x = sc.nextInt();
            while (x > 3 || x <= 0) {
                System.out.println("Opção inválida, selecione novamente:");
                System.out.println("1 - Papel | 2 - Pedra | 3 - Tesoura ");
                x = sc.nextInt();
            }
            result = rd.nextInt(4);
            while (result == 0) {
                result = rd.nextInt(3);
            }
            switch (x) {
                case 1:
                    if (result == 2) {
                        System.out.println("Papel embrulha pedra! VOCÊ GANHOU!");
                        ptsJogador++;
                    }
                    if (result == 3) {
                        System.out.println("Tesoura corta papel! VOCÊ PERDEU!");
                        ptsMaquina++;
                    }
                    break;
                case 2:
                    if (result == 1) {
                        System.out.println("Papel embrulha pedra! VOCÊ PERDEU!");
                        ptsMaquina++;
                    }
                    if (result == 3) {
                        System.out.println("Pedra quebra tesoura! VOCÊ GANHOU");
                        ptsJogador++;
                    }
                    break;
                case 3:
                    if (result == 1) {
                        System.out.println("Tesoura corta papel! VOCÊ GANHOU!");
                        ptsJogador++;
                    }
                    if (result == 2) {
                        System.out.println("Pedra quebra tesoura! VOCÊ PERDEU! ");
                        ptsMaquina++;
                    }
                    break;
            }
            if (x == result) {
                System.out.println("Empate!");
                empate++;
            }
            System.out.println("Deseja jogar novamente [0 - SIM | Qualquer número - NÃO]");
            loop = sc.nextInt();
        }
        System.out.println("\nPLACAR: ");
        System.out.printf("Jogador: %d\nMáquina: %d\nEmpate: %d\n", ptsJogador, ptsMaquina, empate);
        if (ptsJogador == ptsMaquina) {
            System.out.printf("\nEMPATE!!!\n\n");
        } else if (ptsJogador > ptsMaquina) {
            System.out.printf("\nJOGADOR VENCE!\n\n");
        } else {
            System.out.printf("\nMÁQUINA VENCE!\n\n");
        }

        System.out.println("Obrigado por jogar!");
        sc.close();
    }
}
