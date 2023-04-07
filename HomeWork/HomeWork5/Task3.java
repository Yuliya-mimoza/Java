// №3.=====
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

package HomeWork.HomeWork5;

import java.util.Arrays;

public class Task3 {
    private static boolean save(char[][] mat, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (mat[i][c] == 'X') {
                return false;
            }
        }
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 'X') {
                return false;
            }
        }
        for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
            if (mat[i][j] == 'X') {
                return false;
            }
        }
        return true;
    }
    private static void vyvod(char[][] mat) {
        for (char[] chars : mat) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }
    private static void step(char[][] mat, int r) {
        if (r == mat.length) {
            vyvod(mat);
            return;
        }
        for (int i = 0; i < mat.length; i++) {
            if (save(mat, r, i)) {
                mat[r][i] = 'X';
                step(mat, r + 1);
                mat[r][i] = '–';
            }
        }
    }
    public static void main(String[] args) {
        int N = 8;
        char[][] mat = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(mat[i], '–');
        }
        step(mat, 0);
    }
}
