package algorithm.one;

/**
 * 最短路径条数
 */
public class Calc {

    public static void main(String[] args){
        int[][] map = new int[16][16];
        map[0][1] = map[0][4] = 1;
        map[1][0] = map[1][5] = map[1][2] = 1;
        map[2][1] = map[2][6] = map[2][3] = 1;
        map[3][2] = map[3][7] = 1;
        map[4][0] = map[4][5] = 1;
        map[5][4] = map[5][1] = map[5][6] = map[5][9] = 1;
        map[6][5] = map[6][2] = map[6][7] = map[6][10] = 1;
        map[7][6] = map[7][3] = 1;
        map[8][9] = map[8][12] = 1;
        map[9][8] = map[9][13] = map[9][10] = map[9][5] = 1;
        map[10][9] = map[10][14] = map[10][11] = map[10][6] = 1;
        map[11][15] = map[11][10] = 1;
        map[12][8] = map[12][13] = 1;
        map[13][9] = map[13][12] = map[13][14] = 1;
        map[14][10] = map[14][13] = map[14][15] = 1;
        map[15][14] = map[15][11] = 1;
    }

}
