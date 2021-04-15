/*
    Program Description: https://www.codechef.com/problems/CV
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            StringBuilder res = new StringBuilder();

            char [] alphabet = new char[26];
            alphabet['a' - 'a']++;
            alphabet['e' - 'a']++;
            alphabet['i' - 'a']++;
            alphabet['o' - 'a']++;
            alphabet['u' - 'a']++;

            for(int a = 0; a < t; a++) {
                int n = Integer.parseInt(br.readLine());
                String line = br.readLine();
                int count = 0;

                for(int b = 1; b < n; b++) {
                    if(alphabet[line.charAt(b) - 'a'] == 1) {
                        if(alphabet[line.charAt(b-1) - 'a'] == 0) {
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
}
