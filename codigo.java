import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;

        System.out.println(" Digite as notas dos alunos: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;
        double maior = notas[0];
        double menor = notas[0];
        int misete = 0;

        for (int i = 0; i < 10; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] >= 7.0) {
                misete++;
            }
        }

        int reprovado = 0;
        for (int i = 0; i < 10; i++) {
            if (notas[i] < media) {
                reprovado++;
            }
        }

        System.out.println();
        System.out.println(" Maior nota: " + maior);
        System.out.println(" Menor nota: " + menor);
        System.out.println(" Alunos com nota maior ou igual a 7: " + misete);
        System.out.println(" Alunos abaixo da média da turma: " + reprovado);
        System.out.printf(" Média da turma: %.2f\n ", media);
        System.out.println();
        ler.close();
    }
}
