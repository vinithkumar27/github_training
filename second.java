package practice;
class red
{
	 red()
	 {
		 for(int i=0;i<6;i++)
		 {
			 for(int j=6;j>i;j--)
			 {
				 System.out.print("*");
			 }System.out.println();
		 }
	 }
}


class second
{
	public static void main(String[] args)
	{
		red obj = new red();
	}
}