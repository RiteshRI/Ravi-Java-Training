package javaPackage;

public class ExeceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i =1/0;
			System.out.println(i);
		}
		
		catch(Exception e)
		{
			System.out.println("Can't divide by zero");
		}

	}

}
// System.out.println("Can't divide by zero"); whey there is no +a or ... how it is connected from int