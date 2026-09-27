public class Questao08 {

    public static void main(String[] args) {
        Questao08 q8 = new Questao08();

        System.out.println("=== ITEM A: Média Aritmética dos Números da Matriz ===");
        int[][] matriz = new int[2][2]; // Matriz 2x2 instanciada para teste
        double media = q8.calculaMedia(matriz);
        System.out.println("\nA media eh " + media);

        System.out.println("\n=== ITEM C: Múltiplos Comuns de 3 e 5 ===");
        int[] vetor = new int[100]; // Array de 100 posições instanciado
        int qtdMultiplos = q8.contarMultiplos(vetor);
        System.out.println("A quantidade de numeros multiplos comuns de 3 e 5 eh: " + qtdMultiplos);
    }

    // a) Calcular a média aritmética dos números armazenados na matriz
    public double calculaMedia(int[][] matrix) {
        int count = 0;
        double soma = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Teclado.leInt("Digite um numero: ");
                soma = soma + matrix[i][j];
                count++;
            }
        }
        return soma / count;
    }

    // c) Contar os múltiplos comuns de 3 e 5
    public int contarMultiplos(int[] vet) {
        int count = 0;

        for (int i = 1; i < vet.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                vet[i] = i;
                System.out.println(vet[i]);
                count++;
            }
        }
        System.out.println("Esse são multiplos comuns de 3 e 5");
        System.out.println("Tamanho do Array eh: " + vet.length);
        return count;
    }
}