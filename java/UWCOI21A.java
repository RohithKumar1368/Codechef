/*
    Problem Description: https://www.codechef.com/problems/UWCOI21A
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // testcases
            int t = Integer.parseInt(br.readLine());
            // StringBuilder to reduce number of IO
            StringBuilder res = new StringBuilder();

            for(int a = 0; a < t; a++) {
                int n = Integer.parseInt(br.readLine());
                res.append(1 + " " + n + '\n');
            }

            System.out.println(res.toString());

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
