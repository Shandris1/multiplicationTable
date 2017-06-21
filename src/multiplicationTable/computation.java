package multiplicationTable;

public class computation {
public void multiply(int a, int b)
{
	int length = String.valueOf(a).length();
	System.out.println(length);
	System.out.println("Times table of "+a);
	System.out.print("_______________");
	for(int DashLength = 0; DashLength < length;DashLength++)
	{
		System.out.print("_");;
	}
	System.out.println("");
for (int x=1;x<=b;x++)
{
System.out.println(+a+"x"+x+"="+(a*x));
//System.out.println(test);

}

}
}
