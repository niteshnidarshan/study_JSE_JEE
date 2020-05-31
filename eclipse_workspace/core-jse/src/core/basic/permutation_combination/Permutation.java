package core.basic.permutation_combination;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER A STRING");
        Set<String> se=find(in.nextLine());
        System.out.println((se));
    }
    public static Set<String> find(String s)
    {
        Set<String> ss=new HashSet<String>();
        if(s==null)
        {
            return null;
        }
        if(s.length()==0)
        {
            ss.add("");
        }
        else
        {
            char c=s.charAt(0);
            String st=s.substring(1);
            Set<String> qq=find(st);
            for(String str:qq)
            {
                for(int i=0;i<=str.length();i++)
                {
                    ss.add(comb(str,c,i));
                }
            }
        }
        return ss;

    }
    public static String comb(String s,char c,int i)
    {
        String start=s.substring(0,i);
        String end=s.substring(i);
        return start+c+end;
    }
}
