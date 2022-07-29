#include <iostream>  
int binaryToDecimal(int n);
using namespace std;  
int main()  
{  
    int code = 0;
    int hamming_code[7];
    int p1 , p2 , p4;
    int d3, d5, d6, d7;
    int pos;
    cout<<"Enter the 4 digit binary code:"<<endl;
    cin>>code;
    
    d7 = code%10;
    code /= 10;
    
    d6 = code%10;
    code /= 10;

    d5 = code%10;
    code /= 10;

    d3 = code%10;
    code /= 10;
    
     if((d3+d5+d7)%2 == 0)    {
        p1 = 0;
     }
     else 
        p1 = 1;

        if((d3+d6+d7)%2 == 0)    {
        p2 = 0;
     }
     else 
        p2 = 1;

        if((d5+d6+d7)%2 == 0)    {
        p4 = 0;
     }
     else 
        p4 = 1;

    hamming_code[0] = p1;
    hamming_code[1] = p2;
    hamming_code[2] = d3;
    hamming_code[3] = p4;
    hamming_code[4] = d5;
    hamming_code[5] = d6;
    hamming_code[6] = d7;

    cout<<"Genreted Hamming Code is: ";
    for (int i = 0; i<7; i++)   {
        
        cout<<hamming_code[i];
    }
    cout<<endl;
    
    cout<<"Enter a position to change: "<<endl;
    cin>>pos;
    pos-=1;

    if (hamming_code[pos]==0)
        hamming_code[pos]=1;
        
    else
        hamming_code[pos]=0;

    cout<<"Code after generating an error:"<<endl;

    for (int i = 0; i<=6; i++)   {
        cout<<hamming_code[i];
    }
    
   

    int check[3];
    check[0] = hamming_code[0] + hamming_code[2] + hamming_code[4] + hamming_code[6];
    check[1] = hamming_code[1] + hamming_code[2] + hamming_code[5] + hamming_code[6];
    check[2] = hamming_code[3] + hamming_code[4] + hamming_code[5] + hamming_code[6];
    check[0] = ( check[0]%2 == 0 ? 0 : 1);
    check[1] = ( check[1]%2 == 0 ? 0 : 1);
    check[2] = ( check[2]%2 == 0 ? 0 : 1);
    cout<<"check is: " <<check[0]<<check[1]<<check[2]<<endl;
    
    int error_bit = check[2]*4 + check[1]*2 + check[0];
    cout<<"Error bit is: "<<error_bit<<endl;
    return 0;  
} 

