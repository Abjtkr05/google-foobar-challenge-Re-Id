
package com.google.challenges; 

public class Answer 
{
    //function for creating a string of prime numbers
    public static String getPrime()
    {   
        //declaration of variables
        String rs= new String();
        int i,j;
        //stirng creation logic
        for(i=2;i<30000;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i==j)
                {
                    rs=rs+i;
                }
                if(i%j==0)
                {
                    break;    
                }
            }
        }
        return rs;
    }
    //function for returning unique id for each minion
    public static String answer(int n) 
    { 
        //declaration of variables
        String s = new String();
        int i,j,k;
        //id generation logic
        s=getPrime();
        String as=  s.substring(n,n+5);
        return as;
    } 
}

