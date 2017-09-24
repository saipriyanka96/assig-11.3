package ed;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as my

public class ExceptionD {
	//public keyword is used in the declaration of a class,method or 
		//field;public classes,method and fields can be accessed by the 
		//members of any class.
		//class defines instance and class fields,methods and inner classes as
		//well as specifying the interfaces the class implements and the 
			//immediate superclass of the class

		//created class name as tree
		
	public static void main(String[] args) {
		//static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
		
		// TODO Auto-generated method stub
		void dosomething()
		//in main method we have another method doSomething
		{
			int n1=30,n2=40;//Initializing the variables
			int sum=n1+n2;//performs addition
			System.out.println("sum:"+sum);//prints the sum
			//system is final class
			//out is a static member of system class and type printStream
			//println is method of printStream class.ln means nextline
			
		void doMore()//one more method doMore
		{
			int div=40,divi=0;//showing the division with zero
			int divide=div/divi;
			System.out.println("the output is:"+divide);//now it shows error in line 
		}
	}
	}
}
