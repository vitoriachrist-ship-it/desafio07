public class Questao03 {

    public static void main(String[] args) {
        Questao03 q3 = new Questao03();

        int[] v = new int[5]; 
        q3.preencherImpares(v);

        System.out.print("Array v (ímpares): ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("\n");

        double[] notas = new double[3]; 
        double media = q3.digitaNota(notas);
        System.out.println("A média é " + media);
    }

    // Questão 3a) Armazenar números ímpares a partir de 1 no array v
    public void preencherImpares(int[] v) {
        int impar = 1;
        for (int i = 0; i < v.length; i++) {
            v[i] = impar;
            impar = impar + 2; // Passa para o próximo número ímpar
        }
    }

    // Questão 3b) Ler e validar notas no intervalo [0.0, 10.0] utilizando do..while
    public double digitaNota(double[] vet) {
        double soma = 0;

        for (int i = 0; i < vet.length; i++) {
            do {
                vet[i] = Teclado.leDouble("Digite uma nota: ");
                if (vet[i] < 0.0 || vet[i] > 10.0) {
                    System.out.println("Nota inválida!!");
                }
            } while (vet[i] < 0.0 || vet[i] > 10.0);

            soma = soma + vet[i];
        }

        return soma / vet.length;
    }
}