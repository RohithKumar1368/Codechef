/*
    Problem Link: https://www.codechef.com/problems/SNAKPROC 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // number of records to preocess
            int r = Integer.parseInt(br.readLine());

            for(int a = 0; a < r; a++) {
                Stack<Character> st = new Stack<Character>();

                // length of the record
                int l = Integer.parseInt(br.readLine());
                String seq = br.readLine();
                boolean flag = false;

                for(int b = 0; b < l; b++) {
                    switch(seq.charAt(b)) {
                        case 'H':
                            if((!st.empty()) && st.peek() == 'H') {
                                flag = true;
                            } else {
                                st.push('H');
                            }
                            break;
                        case 'T':
                            if((!st.empty()) && st.peek() == 'H') {
                                st.pop();
                            } else {
                                flag = true;
                            }
                            break;
                    }

                    if(flag) break;
                }

                if(!flag && st.empty()) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
