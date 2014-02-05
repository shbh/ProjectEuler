package euler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shashi on 1/30/14.
 */
public class CodedTriangleNumbers {

	static List<Integer> triangleNumber = new ArrayList<>();
	static int max = 0;
    public static void main(String[] args)
    {
    	
    	int n = 1;
    	int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\words.txt")))
        {

            String sCurrentLine=br.readLine();
            long totalsum = 0;
            String[] names = sCurrentLine.split(",");
            Arrays.sort(names);
            for(int i=0;i<names.length;i++)
            {

                int sum =0;
                char[] charcters = names[i].replace("\"", "").toCharArray();
                for(int c=0;c<charcters.length;c++)
                {
                	sum+=charcters[c]-64;
                	if(sum>max)
                	{
                		n = generateNext(n, sum);
                		System.out.println(n + "::"+triangleNumber.size()+"::"+sum);
                	}
                	
                	
                }
                if(triangleNumber.contains(sum))
            	{
            		count++;
            	}


            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static int generateNext(int n, int limit)
    {
    	//tn = ½n(n+1)
    	int sum = n*(n+1)/2;
    	triangleNumber.add(sum);
    	max = sum;
    	if(sum<limit)
    	{
    		return generateNext(n+1, limit);
    	}
    	return n;
    	
    }
}
