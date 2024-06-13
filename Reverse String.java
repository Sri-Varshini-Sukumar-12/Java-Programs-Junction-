/*
INPUT : hello
OUTPUT: olleh
*/

import java.util.*;
public class Hello {
    public static void reverseString(char[] s) {
        char[] rev = new char[s.length];
        int j = 0;
        for (int i = s.length - 1; i > -1; i--) {
            rev[j++] = s[i];
        }
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        reverseString(s);
        sc.close();
    }
}
