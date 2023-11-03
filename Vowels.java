class Main_Vowel
{
    public static void main(String args[])
    {
    Vowels v=new Vowels();
    v.s= new String("happy neeew year");
    v.calVowel();
    }
}
class Vowels
{
   String s="";
   public void calVowel()
   {
	String st[]=s.split(" ");
	String b="";
	int max=0;
	int x, y, count=0;
	for(x=0; x<st.length; x++)
	{
	    count=0;
	    String str=st[x]; 
	    for(y=0; y<str.length(); y++)
	    {
		if(str.charAt(y)=='a' || str.charAt(y)=='e' || str.charAt(y)=='i' || str.charAt(y)=='o' || str.charAt(y)=='u')
		{
		    count++;
		}
	    }
	    if(max<count)
	    {
		max=count;
		b=st[x];
	    }
	}
	System.out.println(b);
   }
}