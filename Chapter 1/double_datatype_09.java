public class double_datatype_09
{
	public static void main(String[] args) {
	    double x = 3;
	    double y = 6;
	    double z =x/y;
		System.out.println(z);
		
		z = 5/2; // In this 5/2 is treated as integer and get divide than get store into z variable as double
		System.out.println(z);
		
		z =5.0/2; // 5/5 = 2, 5.0/2 = 2.5, 5/2.0 = 2.5, 5.0/2.0 = 2.5
		System.out.println(z);
		
		System.out.println(x);
		
		// Arithmetic Operators on double datatype
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}
}