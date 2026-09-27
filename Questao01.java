public class Questao01
{
    public static void main(String args[]){
        int[] a = {507, -15, 147, 2194, 300, 27, 888, -110, 0, 675};
        int i=2;
        
        System.out.println("Indice " + i + " Contem o elemento " + a[i]);
        System.out.println("Terceiro Elemento do array a e " + a[2]);
        System.out.println("Primeiro Elemento do array e " + a[1]);
        System.out.println("E qual e o Elemento zero do array? " + a[0]);
        
        a[1] = Teclado.leInt("Informe um numero inteiro: ");
        System.out.println("Agora o elemento 1 é o que voce digitou. É igual a " + a[1]);
    }
}