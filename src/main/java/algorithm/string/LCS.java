package algorithm.string;

/**
 * 字符最长串公共子序列
 */
public class LCS {

    public static void main (String[] args){

        char[] s1 = new char[]{'A', 'B', 'C', 'B', 'D', 'A', 'B'};
        char[] s2 = new char[]{'B', 'D', 'C', 'A', 'B', 'A'};
        LCS.LCS(s1, s2);
    }

    public static void LCS(char[] s1, char[] s2){
        int size1 = s1.length; //列
        int size2 = s2.length; //行
        int[][] chess = new int[size1 + 1][size2 + 1];
        for (int i = 0; i <= size1; i++){//列
            chess[i][0] = 0;
        }
        for (int j = 0; j <= size2; j++){//行
            chess[0][j] = 0;
        }
        /*
        [0, 0, 0, 0, 1, 1, 1]
        [0, 1, 1, 1, 1, 2, 2]
        [0, 1, 1, 2, 2, 2, 2]
        [0, 1, 1, 2, 2, 3, 3]
        [0, 1, 2, 2, 2, 3, 3]
        [0, 1, 2, 2, 3, 3, 4]
        [0, 1, 2, 2, 3, 4, 4]
        */

        for (int i = 1; i <= size1; i++){
            for (int j = 1; j <= size2; j++){
                if(s1[i - 1] == s2[j - 1]){
                    chess[i][j] = chess[i - 1][j - 1] + 1;
                }else{
                    chess[i][j] = Math.max(chess[i -1][j], chess[i][j -1]);
                }
            }
            System.out.println(java.util.Arrays.toString(chess[i]));
        }

        int i = size1;
        int j = size2;
        StringBuffer sb = new StringBuffer();
        while ((i != 0) && (j != 0)){
            if(s1[i - 1] == s2[j - 1]){
                sb.append(s1[i - 1]);
                i--;
                j--;
            }else{
                if(chess[i][j - 1] > chess[i -1][j])
                    j--;
                else
                    i--;
            }
        }
        System.out.print(Reverse.reverseString(sb.toString()));
    }
}
