#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int t{};
    cin >> t;
    
    for(int a = 0; a < t; a++) {
       long n{}, k{}; 
       cin >> n >> k;
       
       for(int b = 0; b < n; b++) {
           long temp{};
           cin >> temp;
           if(temp % k == 0) {
               cout << 1;
           } else {
               cout << 0;
           }
        }
        cout << "\n";
    }
	return 0;
}
