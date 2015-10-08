public class MyHasher extends Hasher
{
	public static void main (String[] args)
	{
		Boolean bool = true;
		MyHasher test = new MyHasher();
		System.out.print(test.hash(bool));
		System.out.print(test.hash(test));
	}
	public int hash(Object obj)
	{
		String str = obj.toString();
		int num = 0;
		for (int i = 0; i < str.length(); i++)
		{
			num += (int)str.charAt(i);
		}
		return num;
	}
	public String getCoderName()
	{
		return "Brendan Raimann";
	}
}