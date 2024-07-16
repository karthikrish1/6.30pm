package methodss;

public class m5 {
public static void main(String[] args) {
	//add return statment at end
	// sysout
	m5 ob= new m5();
	System.out.println("Division is "+ ob.div());
	System.out.println("Product is "+ ob.prod());
	
	//public:  details : void (name, age, address)
	
	// private: return area of parallelogram :  d1*d2
}

public float div()
{
	float m=3.4f;
	float n=2.3f;
	return m/n;
	}

private int prod()
{
	int a=3;
	int b=4;
	return a*b;
	}
}
