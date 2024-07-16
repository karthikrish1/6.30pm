package methodss;

public class m4 {

	public static void main(String[] args) {
		m4 ob= new m4();
		ob.add();
		ob.area();

	}
	public void add()
	{
		int a=4;
		int b=3;
		System.out.println("Addition is "+ (a+b));
	}
	
	
	private void area()
	{
		int s=9;
		System.out.println("area is "+ s*s);
	}

}

//same rules
//nonstatic: doesnt contain fixed memory space

// syntax for creation:  accessmodifier returntype name(){}
//syntax fpr calling:
//object creation and namng:    classname objectname=new classname();
//                              objectname.methodname();
