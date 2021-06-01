#include <iostream>
#include <vector>
// #include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int t{};
    cin >> t;
    
    // testcases
    for(int a = 0; a < t; a++) {
        int n{}, k{};
        cin >> n >> k;
        int sum{};
        
        // take input and calculate number
        for(int b = 0; b < n; b++){
            int el{};
            cin >> el;
            sum += el; 
        }
        
        if(sum % k) {
            cout << 1 << "\n";
        } else {
            cout << 0 << "\n";
        }
    }
    
	return 0;
}
