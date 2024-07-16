package operators;

public class op1 {

	public static void main(String[] args) {
		
		//arithmetic operators: +,-,*,/
		//comparision operators: <,>,<=,>=,==,!=
		//assignment operators: +=,-=,*=
		//conditional operator/ternary operator:   condition ? true : false 
		//logical operators:   and, or, not
		int a=30;
		System.out.println(a);
		//add 5 to a
		//a+=5;
		//a-=2;
		//a*=2;
		//a/=3;
		
		//                 cond ?  true   : false 
		System.out.println(a>18 ? "Major": "Minor");
		/*
		 * and   &&
		 * 
		 * true  true  true
		 * true false  false
		 * false true   false
		 * false false false 
		 * 
		 * 
		 * or ||
		 * 
		 * true  true  true
		 * true false  true
		 * false true  true
		 * false false false
		 * 
		 * not !
		 * true=> false
		 * fakse=> true
		 * 
 * 
		 * */
		
		int m=30;
		int n=3;
		System.out.println("And");
		System.out.println(m>10 && n<5);
		System.out.println(m>10 && n==5);
		System.out.println(m==10 && n<5);
		System.out.println(m==10 && n==5);
		System.out.println();
		System.out.println("or");
		System.out.println(m>10 || n<5);
		System.out.println(m>10 || n==5);
		System.out.println(m==10 || n<5);
		System.out.println(m==10 || n==5);
		System.out.println();
		System.out.println("Not");
		System.out.println(m==30);
		System.out.println(m!=30);
	}
}
