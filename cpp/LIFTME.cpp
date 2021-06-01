#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    
    int t{};
    cin >> t;
    
    for(int a = 0; a < t; a++) {
        int n{}, q{};
        cin >> n >> q;
        
        int cur{};
        long res{};
        for(int b = 0; b < q; b++) {
            int f{}, d{};
            cin >> f >> d;
            
            res += abs(cur - f);
            cur = f;
            res += abs(cur - d);
            cur = d;
        }
        cout << res << "\n";
    }
    
	return 0;
}
