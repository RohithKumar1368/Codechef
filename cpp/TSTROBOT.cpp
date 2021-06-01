#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int t{};
    cin >> t;
    
    while(t--) {
        int n{}, x{};
        cin >> n >> x;
        
        string movements;
        cin >> movements;
        
        int max = x;
        int min = x;
        
        for(int a = 0; a < movements.length(); a++) {
            if(movements[a] == 'R') {
                if(++x > max) max = x;
            } else {
                if(--x < min) min = x;
            }
        }
        
        cout << (abs(max - min) + 1) << "\n";
    }
    
	return 0;
}
