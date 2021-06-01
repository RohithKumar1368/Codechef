#include <bits/stdc++.h>

using namespace std;

int main() {
	// your code goes here
	ios::sync_with_stdio(false);
	cin.tie(0);
	
	int t{};
	cin >> t;
	
	for(int a = 0; a < t; a++) {
	   int n{};
	   cin >> n;
	   int rating[n];
	   
	   int hmul{};
	   int hri{};
	   int ind{};
	   for(int b = 0; b < n; b++){
	       cin >> rating[b];
	   }
	   
	   for(int b = 0; b < n; b++) {
	       int temp{};
	       cin >> temp;
	       rating[b] *= temp;
	       
	       if(rating[b] > hmul) {
	           hmul = rating[b];
	           hri = temp;
	           ind = b;
	       }
	       
	       if(rating[b] == hmul) {
	           if(temp > hri) {
	               hri = temp;
	               ind = b;
	           }
	       }
	   }
	   
	   cout << (ind+1) << "\n";
	}
	return 0;
}
