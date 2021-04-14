/*
    Problem Description: https://www.codechef.com/problems/INTEST
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String [] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int k = Integer.parseInt(line[1]);
            int count = 0;

            for(int a = 0; a < n; a++) {
                int temp = Integer.parseInt(br.readLine());
                if(temp % k == 0) {
                    count++;
                }
            }

            System.out.println(count);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
