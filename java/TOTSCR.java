/*
    Problem Description: https://www.codechef.com/problems/TOTSCR
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // testcases
            int t = Integer.parseInt(br.readLine());

            // to reduce the no of IO
            StringBuilder res = new StringBuilder();
            
            for(int a = 0; a < t; a++) {
                String [] line = br.readLine().split(" ");


                int n = Integer.parseInt(line[0]);
                int k = Integer.parseInt(line[1]); 

                int []points = new int[k];

                line = br.readLine().split(" ");
                for(int b = 0; b < k; b++) {
                    points[b] = Integer.parseInt(line[b]);
                }

                for(int b = 0; b < n; b++) {
                    String li = br.readLine();
                    long score = 0;

                    for(int c = 0; c < li.length(); c++) {
                        if(li.charAt(c) == '1') score += points[c];
                    }

                    res.append(score + "\n");
                }
            }

            System.out.println(res.toString());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
