class Year
{
   public static void main(String args[])
   {
	int a=2002;
	System.out.println((a%4==0 && a%100!=0 || a%400==0)?"It is a leap year  \n" + "Increment = "  + a++:"It is not a leap year  \n"  + "Increment = " + ++a);
   }
}