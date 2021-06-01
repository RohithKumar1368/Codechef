#include <bits/stdc++.h>

using namespace std;

int main() {
	// your code goes here
	ios::sync_with_stdio(false);
	cin.tie(0);
	
	int t{};
	cin >> t;
	
	for(int a = 0; a < t; a++) {
	    int x{}, y{};
	    cin >> x >> y;
	    if(x <= y) {
	        cout << "0\n";
	        continue;
	    }
	    
	    int count = 1;
	    while((y - count) >= 0 && ((2 * count) + (y - count)) < x) count++; 
	    
	    cout << count << "\n";
	}
	
	return 0;
}
