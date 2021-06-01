#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int t{};
    cin >> t;
    
    for(int a = 0; a < t; a++) {
        int n{};
        cin >> n;
        int seq[n];
        
        for(int b = 0; b < n; b++) {
            cin >> seq[b];
        }
        
        int m{};
        cin >> m;
        int sub[m];
        
        for(int b = 0; b < m; b++) {
            cin >> sub[b];
        }
        
        int in = 0;
        for(int b = 0; b < n; b++) {
            if(in < m && seq[b] == sub[in]) {
                in++;
            }
            
            if(in == m) break;
        }
        
        if(in == m) {
            cout << "Yes\n";
        } else {
            cout << "No\n";
        }
    }
	return 0;
}
