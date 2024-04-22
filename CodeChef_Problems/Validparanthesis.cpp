// problem link
// https://www.codechef.com/practice/course/stacks-and-queues/STAQUEF/problems/PREP59

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	    string str;
	    cin >> str;
	    stack<char> stk;
	    bool valid = true;

	    for(int i = 0; i<str.length();i++){
	        if(stk.size() == 0 && str[i] == ')'){
	            valid = false;
	            break;
	        }

	        if(str[i] == ')'){
	            stk.pop();
	        }else{
	            stk.push('(');
	        }
	    }

	    if(stk.size() == 0 && valid){
	        cout << 1 << endl;
	    }else{
	        cout<< 0 << endl;
	    }


	}
}
