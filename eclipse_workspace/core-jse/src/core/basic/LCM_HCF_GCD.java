package core.basic;

/**
 * LCM(Lowest Common Factor) 
 * 
 * HCF(Highest Common Factor) / GCD(Greatest Common Divisor)
 * 
 * HCF with Recursive
 * 
 * @author niteshnidarshan
 *
 */
public class LCM_HCF_GCD {

	public static int getHCF(int p, int q)
	{
		if(q==0) return p;
		
		int reminder = p%q;
		
		return getHCF(q, reminder);
	}
	
	public static int getLCM(int p, int q)
	{
		return (p*q)/getHCF(p,q);
	}
	
	public static void main(String[] args) {
		System.out.println(getHCF(8, 12)); //4
		System.out.println(getLCM(3,18)); //18
	}

}
