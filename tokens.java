class Test2
{
public static void main(String[] args)
	{
	String s =" Something to,Written and shown,to the paricipants";
	StringTokenizer st= new StringTokenizer(s,",");
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	System.out.println(st.nextTokens());
}
}