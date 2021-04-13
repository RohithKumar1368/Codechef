/*
    Program Description: https://www.codechef.com/problems/HS08TEST
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String [] line = br.readLine().split(" ");
            
            // cash to withdraw
            int cash = Integer.parseInt(line[0]);

            // account balance
            double balance = Double.parseDouble(line[1]);

            double new_balance = balance-cash-0.5;

            if((cash % 5 == 0) && new_balance >= 0) {
                System.out.printf("%.2f%n", new_balance); 
            } else {
                System.out.printf("%.2f%n", balance);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
