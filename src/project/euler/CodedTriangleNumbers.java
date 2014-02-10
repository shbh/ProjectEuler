package project.euler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import project.euler.base.IProblem;
import project.euler.base.Key;

/**
 * Created by shashi on 1/30/14.
 */
public class CodedTriangleNumbers  implements IProblem{

	static List<Integer> triangleNumber = new ArrayList<>();
	static int max = 0;
	private String path;
    public Integer solve()
    {
    	
    	int n = 1;
    	int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {

            String sCurrentLine=br.readLine();
            
            String[] names = sCurrentLine.split(Key.COMMA);
            Arrays.sort(names);
            for(int i=0;i<names.length;i++)
            {

                int sum =0;
                char[] charcters = names[i].replace(Key.FORWARD_SLASH, Key.BLANK).toCharArray();
                for(int c=0;c<charcters.length;c++)
                {
                	sum+=charcters[c]-64;
                	if(sum>max)
                	{
                		n = generateNext(n, sum);
                		
                	}
                	
                	
                }
                if(triangleNumber.contains(sum))
            	{
            		count++;
            	}


            }
            return count;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    private int generateNext(int n, int limit)
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

	public CodedTriangleNumbers path(String path) {
		
		this.path = path;
		return this;
	}
}
