/*
    Problem Description: https://codechef.com/problems/NOMATCH
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // testcases
            int t = Integer.parseInt(br.readLine());
            
            for(int a = 0; a < t; a++) {
                // no of elements
                int n = Integer.parseInt(br.readLine());
                int []val = new int[n];
                String [] line = br.readLine().split(" ");

                for(int b = 0; b < line.length; b++) {
                    val[b] = Integer.parseInt(line[b]);
                }

                Arrays.sort(val);

                // maximum of the given condition
                long max = 0;
                for(int b = 0; b < n/2; b++) {
                    max += Math.abs(val[n-b-1] - val[b]);
                }

                System.out.println(max);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
