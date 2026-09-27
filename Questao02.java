public class Questao02
{
    public static void main(String args[])
    {
        int[] vet;
        vet = new int[15];
        System.out.println("Valor na posição vet[5]: " + vet[5]);
        
        int tam = vet.length;
        System.out.println("Tamanho do vetor (tam): " + tam);
        
        System.out.println("Conteúdo do último elemento (vet[14]): " + vet[tam - 1]);
        
        System.out.println("Conteúdo do primeiro elemento (vet[0]): " + vet[0]);
        
        double[] medias = new double[20];
        System.out.println("Tamanho do array 'medias': " + medias.length);
    }
}