package project.euler;


public class IntegerRightTriangles {

	public static void main(String[] args) {
		int marker = 1000;
		int count =0;
		int max=0;
		for (int i = 0; i <= marker; i++) {
			int x = dosomething(i);
			if(x>count)
			{
				count = x;
				max = i;
				
			}
		}
		System.out.println(max +"::"+count);
		
	}
	
	
	public static int dosomething(int marker)
	{
		int count=0;
		for(int c = 1; c<=marker;c++)
        {

                int a;
                int residue = marker-c;
                for(int b = 1; b<residue;b++)
                {
                    a = residue-b;
                    if(a*a+b*b==c*c)
                    {
                    	
                    	count++;
                    }
                    else
                    {
                        if(a==b || a==(b-1))
                        {
                            break;
                        }
                    }
                }


        }
		return count;
	}
}
