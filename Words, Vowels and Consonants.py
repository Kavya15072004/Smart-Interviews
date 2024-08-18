/*
Given a sentence containing only uppercase/lowercase english alphabets and spaces, you have to count the number of words, vowels and consonants.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single sentence.

Constraints

1 <= T <= 1000
1 <= len(sentence) <= 104

Output Format

For each test case, print the number of words, vowels and consonants, separated by newline.

Sample Input 0

4
Hi
Hello World
  Exception  
Hi there
Sample Output 0

1 1 1
2 3 7
1 4 5
2 3 4
Explanation 0

Self Explanatory
*/
for j in range(int(input())):
    n=input()
    w=0
    v=0
    c=0
    w=len(n.split())
    for i in range(len(n)):
        if (n[i]>='A' and n[i]<='Z') or (n[i]>='a' and n[i]<='z'):
            if n[i]=='A' or n[i]=='E' or n[i]=='I' or n[i]=='O' or n[i]=='U' or n[i]=='a' or n[i]=='e' or n[i]=='i' or n[i]=='o' or n[i]=='u':
                v+=1
            else:
                c+=1
    
    print(w,v,c)
