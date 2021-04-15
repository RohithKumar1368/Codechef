/*
    Program Description: https://www.codechef.com/problems/CV
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    private static char [] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            StringBuilder res = new StringBuilder();

            for(int a = 0; a < t; a++) {
                int n = Integer.parseInt(br.readLine());
                String line = br.readLine();
                int count = 0;

                for(int b = 1; b < n; b++) {
                    if(vowel(line.charAt(b))) {
                        if(consonant(line.charAt(b-1))) {
                            count++;
                            b++;
                        }
                    }
                }
                res.append(count + "\n");
            }

            System.out.println(res.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean vowel(char ch) {
        for(char a: vowels) {
            if(a == ch) return true;
        }
        return false; }

    private static boolean consonant(char ch) {
        for(char a: vowels) {
            if(a == ch) return false;
        }
        return true;
    }
}
