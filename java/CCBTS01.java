/*
    Problem Description: https://www.codechef.com/problems/CCBTS01
*/

import java.util.*;
import java.io.*;
import java.lang.*;

class Codechef {
    public static void main(String [] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // testcases
            int t = Integer.parseInt(br.readLine());
            
            // to reduce IO
            StringBuilder res = new StringBuilder();

            for(int a = 0; a < t; a++) {
                String line = br.readLine();
                boolean [] freq = {false, false, false};

                for(int b = 0; b < line.length(); b++) {
                    switch(line.charAt(b)) {
                        case 'P':
                            freq[0] = true;
                            break;
                        case 'C':
                            freq[1] = true;
                            break;
                        case 'M':
                            freq[2] = true;
                            break;
                    }
                }

                if(freq[0] && freq[1] && freq[2]) {
                    res.append("YES\n");
                } else {
                    res.append("NO\n");
                }
            }

            System.out.println(res.toString());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
