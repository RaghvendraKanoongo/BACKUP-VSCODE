#include <iostream>
#include <vector>
using namespace std;

void permuntation(string a, vector<string> &vect, int index)
{

    if (index >= a.size())
    {
        cout << a << endl;
        vect.push_back(a);
        return;
    }

    // a = abc; i = 0
    for (int i = index; i < a.size(); i++)
    {
        swap(a[i], a[index]);
        permuntation(a, vect, index + 1);
        swap(a[i], a[index]);
    }
}

int solve(string a, string b)
{

    vector<string> vect;
    permuntation(a, vect, 0);
    return 0;
}

int main(int argc, char const *argv[])
{
    string a = "abc", b = "abcbacabc";
    cout << solve(a, b) << endl;
    return 0;
    
}

