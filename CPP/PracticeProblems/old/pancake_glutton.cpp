/* 
Write a program that asks the user to enter the number of pancakes eaten for breakfast by 10 different
people (Person 1, Person 2, ..., Person 10) Once the data has been entered the program must analyze the
data and output which person ate the most pancakes for breakfast.

Modify the program so that it also outputs which person ate the least number of pancakes for breakfast.

Modify the program so that it outputs a list in order of number of pancakes eaten of all 10 people.
i.e.
Person 4: ate 10 pancakes
Person 3: ate 7 pancakes
Person 8: ate 4 pancakes
...
Person 5: ate 0 pancakes */


#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int pancakes[10];
    for(int i=0;i<10;i++)
    {
        cout<<"Person "<<i+1<<"! How many pancakes? "<<endl;
        cin>>pancakes[i];
    }
    
    int large = *max_element(pancakes,pancakes+9);
    int small = *min_element(pancakes,pancakes+9);
    int m_person; int l_person;
    int most = 0;
    int least = 9999999;
    for(int j=0;j<10;j++)
    {
        if(pancakes[j]>most)
        {
            most = pancakes[j];
            m_person = j+1;
        }
        if(pancakes[j]<least)
        {
            least = pancakes[j];
            l_person = j+1;
        }
            
    }
    cout<<"The person who at the most pancakes was, "<<m_person<<". They ate "<<most<<" pancakes."<<endl;
    cout<<"The person who at the least pancakes was, "<<l_person<<". They ate "<<least<<" pancakes."<<endl;
    
    
    
    
    
    return 0;
}

