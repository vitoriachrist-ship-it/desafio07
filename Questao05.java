public class Questao05 {

    public static void main(String[] args) {
        // Declaração e inicialização da matriz conforme a imagem
        int[][] mat = {
            {13, 45, 12, 19},
            {67, -5, 88, 37},
            {11, 43, 13,  0},
            {64, 52, 29, 18},
            {71, 14, 19, 62}
        };

        System.out.println("a) Linhas: " + mat.length);
        System.out.println("b) Colunas: " + mat[0].length);
        System.out.println("d) mat[1][1]: " + mat[1][1]);
        System.out.println("e) mat[2][0] + 1: " + (mat[2][0] + 1));
        System.out.println("f) mat[3+1][3-1]: " + mat[3 + 1][3 - 1]);

        int x = 2;
        System.out.println("g) mat[x][x]: " + mat[x][x]);
        System.out.println("h) mat[x+1][x]: " + mat[x + 1][x]);
        System.out.println("i) mat[x][x] + 1: " + (mat[x][x] + 1));

        System.out.println("j) mat.length: " + mat.length);
        System.out.println("k) mat[mat.length-1][1]: " + mat[mat.length - 1][1]);
        System.out.println("l) Total de elementos: " + (mat.length * mat[0].length));
    }
}