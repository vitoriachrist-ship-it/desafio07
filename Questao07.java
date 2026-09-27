public class Questao07 {

    public static void main(String[] args) {
        Questao07 q7 = new Questao07();

        System.out.println("=== ITEM A: Números Ímpares ===");
        int[][] m1 = new int[5][5]; // Matriz 5x5 já instanciada
        int qtdImpares = q7.impares(m1);
        System.out.println("\nA qtd de impares eh " + qtdImpares);

        System.out.println("\n=== ITEM B: Números Aleatórios [10, 51] ===");
        int[][] m2 = new int[4][4]; // Matriz 4x4 já instanciada
        int qtdAleatorios = q7.numAleatorios(m2);
        System.out.println("\nA qtd de numeros eh " + qtdAleatorios);
    }

    // a) Armazenar na matriz m os números ímpares a partir de 1
    public int impares(int[][] matrix) {
        int count = 0;
        int impar = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = impar;
                System.out.println(matrix[i][j]);
                impar += 2; // Passa para o próximo ímpar (1, 3, 5, 7...)
                count++;
            }
        }
        return count;
    }

    // b) Armazenar na matriz m números aleatórios no intervalo [10, 51]
    public int numAleatorios(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Fórmulas de inteiros no intervalo [10, 51]: 10 + (int)(Math.random() * 42)
                matrix[i][j] = 10 + (int)(Math.random() * 42);
                System.out.println(matrix[i][j]);
                count++;
            }
        }
        return count;
    }
}