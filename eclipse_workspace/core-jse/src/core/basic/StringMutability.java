package core.basic;
/**
 * String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.
 * By applying String.intern() on a couple of strings will ensure that all strings having the same contents share the same memory. 
 * 
 * This can be very useful to reduce the memory requirements of your program. But be aware that
 * the cache is maintained by JVM in permanent memory
 * pool which is usually limited in size compared to heap so you should not use intern if you don’t have too many duplicate values
 * 
 * @author niteshnidarshan
 *
 */
public class StringMutability {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = s1;
		String s4 = new String("hello");
		String s5 = new String("hello");
		
		System.out.println(s1==s2);//true
		System.out.println(s1==s4);//false
		System.out.println(s4==s5);//false
		System.out.println(s1==s4.intern());//true
		System.out.println(s4==s5.intern());//false
		System.out.println(s4.intern()==s5.intern());//true
	}

}
