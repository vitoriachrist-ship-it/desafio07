public class Questao04 {

    public static void main(String[] args) {
        Questao04 q4 = new Questao04();

        // --- TESTE DA QUESTÃO 4A ---
        System.out.println("=== Questão 4a: Cálculo da Média ===");
        int[] notas = new int[3];
        float media = q4.digitaNota(notas);
        System.out.printf("A media eh %.2f\n\n", media);

        // --- TESTE DA QUESTÃO 4B ---
        System.out.println("=== Questão 4b: Múltiplos de 3 e 5 ===");
        // Criando e preenchendo um array de exemplo de 1 a 100
        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        int quantMultiplos = q4.contarMultiplos3e5(numeros);
    }

    // Questão 4a
    public float digitaNota(int[] vet) {
        int soma = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = Teclado.leInt("Digite uma nota: ");

            while (vet[i] < 0 || vet[i] > 10) {
                System.out.println("Nota inválida!!");
                vet[i] = Teclado.leInt("Digite outra nota: ");
            }

            soma += vet[i];
        }

        return (float) soma / vet.length;
    }

    // Questão 4b
    public int contarMultiplos3e5(int[] vet) {
        int count = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 3 == 0 && vet[i] % 5 == 0 && vet[i] != 0) {
                System.out.println(vet[i]);
                count++;
            }
        }

        System.out.println("Esse são multiplos comuns de 3 e 5");
        System.out.println("Tamanho do Array eh: " + vet.length);
        System.out.println("A quantidade de numeros multiplos comuns de 3 e 5 eh: " + count);

        return count;
    }
}