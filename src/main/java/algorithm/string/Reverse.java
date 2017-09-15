package algorithm.string;

/**
 * 字符串翻转
 */
public class Reverse {

    public static void main(String[] args){
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        Reverse.reverseString(chars, 0, 1);
        System.out.println(chars);
        Reverse.reverseString(chars, 2, 5);
        System.out.println(chars);
        Reverse.reverseString(chars, 0, 5);
        System.out.println(chars);
    }

    public static void reverseString(char[] s, int from, int to){

        while (from < to){
            char t = s[from];
            s[from ++] = s[to];
            s[to --] = t;
        }
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        Reverse.reverseString(chars, 0, chars.length - 1);
        return String.valueOf(chars);
    }

}
