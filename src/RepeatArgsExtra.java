
public class RepeatArgsExtra
{
    public static void main(String[] args)
    {
        int index = 0;
        while (index < args.length)
        {
        	int CharCount = 0;
        	while(CharCount < args[index].length())
        	{
        		System.out.println(args[index]);
        		CharCount++;
        	}
        	index++;
        }
    }
}
