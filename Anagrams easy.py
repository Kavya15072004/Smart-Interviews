/*
Given 2 strings, check if they are anagrams. An anagram is a rearrangement of the letters of one word to form another word. In other words, some permutation of string A must be same as string B.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing 2 space separated strings.

Constraints

10 points
1 <= T <= 100
1 <= len(S) <= 103
'a' <= S[i] <= 'z'

40 points
1 <= T <= 100
1 <= len(S) <= 105
'a' <= S[i] <= 'z'

Output Format

For each test case, print True/False, separated by newline.

Sample Input 0

4
a a
b h
stop post
hi hey
Sample Output 0

True
False
True
False
Explanation 0

Self Explanatory
*/
for i in range(int(input())):
    m,n=input().split()
    #n=input()
    if(len(m)==len(n)):
        k=''.join(sorted(m))
        l=''.join(sorted(n))
        if(k==l):
            print("True")
        else:
            print("False")
    else:
        print("False")
