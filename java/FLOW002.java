/*
    Program Description: https://www.codechef.com/problems/FLOW002
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());
            StringBuilder res = new StringBuilder();

            for(int a = 0; a < t; a++) {
                String [] line = br.readLine().split(" ");
                int first = Integer.parseInt(line[0]);
                int second = Integer.parseInt(line[1]);

                res.append((first % second) + "\n");
            }
            System.out.println(res.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
