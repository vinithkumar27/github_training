package practice;
import java.io.DataInputStream;
class one
{
	DataInputStream in = new DataInputStream(System.in);
	one()
	{
	   System.out.println("enter your age");
	   try {
	   String age = in.readLine();
	   }catch(Exception e){}
	}
}


class first
{
	public static void main(String[]sdf)
	{
		 one obj = new one();
	}
}