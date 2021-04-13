/*
    Program Description: https:www.codechef.com/problems/FLOW001
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());

            for(int a = 0; a < t; a++) {
                String [] line = br.readLine().split(" ");
                int one = Integer.parseInt(line[0]);
                int two = Integer.parseInt(line[1]);
                int result = one + two;

                System.out.println(result);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
