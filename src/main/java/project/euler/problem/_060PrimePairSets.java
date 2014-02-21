 package project.euler.problem;  
 
 import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;

import project.euler.IProblem;
 public class _060PrimePairSets  implements IProblem 
 {  
      public static HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();  
      public static HashMap<Integer, ArrayList<Integer>> ht_commons = new HashMap<Integer, ArrayList<Integer>>();  
      
      static Logger logger = Logger.getLogger(_060PrimePairSets.class);

      public Long solve()  
      {  
 
          
    	  long sum = computeRemarkablePrimes(5);
          
    	  if(sum!=-1)  
           {  
                System.out.println("The computed sum is: " + sum);  
           }  
           else  
           {  
                System.out.println("Could not identify such prime numbers. Consider increasing the number of primes in your prime set");  
           }  
           
           return sum;
      }
      
      
      /**  
       * Computes the sum of the first <code>n</code> remarkable primes, where  
       * two primes are defined as remarkable when the concatenation of the two  
       * numbers creates a prime number as well. Example: 7 and 3.   
       *   
       * @param n  
       * The number of desired remarkable primes.  
       * @return  
       * The sum of the first "n" remarkable primes   
       */  
      public static long computeRemarkablePrimes(int n)  
      {  
    	  long sum = 0;   
          //Compute the primes and their pairwise remarkable primes between 2 and 10,000  
          //if this fails to find the desired remarkable primes, consider increasing this number  
          for(int i = 3; i <=10000; i=i+2 )  
          {  
               if(isPrime(i))  
               {  
                    ArrayList<Integer> al = new ArrayList<Integer>();  
                  
                    ht_commons.put(new Integer(i), al);  
                    
                    for(int j=i+2; j<=10000; ++j)  
                    {  
                    
                    	if(isPrime(j))  
                         {  
                        
                    		int p1 = Integer.parseInt(""+j+i);  
                            
                    		int p2 = Integer.parseInt(""+i+j);  
                            
                    		if(isPrime(p1) && isPrime(p2))  
                              {  
                            
                    			al.add(new Integer(j));  
                             
                              }  
                         }  
                    }  
               }  
          }  

          
          //Now we have our prime sets, iterate through the prime sets to find the n remarkable primes  
          for(int i = 3; i <= 10000; i=i+2)  
          {  
          
        	  ArrayList<Integer> al1 = ht_commons.get(new Integer(i));  
              
        	  ArrayList<Integer> answers = getMinimumMatch(al1, n-1);  
              
        	  answers.add(new Integer(i));  
              
        	  if(answers.size()==n)  
              
        	  {  
              
        		  for(Integer answer: answers)  
                  
        		  {  
                  
        			  sum += answer.intValue();  
                    
        		  }  
                 
        		  break;  
               
        	  }  
          }
		
          return sum; 
      
      }  
      
      public static ArrayList<Integer> getMinimumMatch(ArrayList<Integer> matches, int size)  
      {  
           if(matches!=null && matches.size() >= size)  
           {  
                for(Integer parent: matches)  
                {  
                     ArrayList<Integer> al = ht_commons.get(parent);  
      
                     if(al!=null && al.size()>=size)  
                     {  
                     
                    	 ArrayList<Integer> test = new ArrayList<Integer>();  
                         
                    	 for(Integer child: al)  
                         
                    	 {  
                               if(matches.contains(child))  
                               {  
                         
                            	   test.add(child);  
                               
                               }  
                          }  
                          
                    	 if(test.size() >= (size)-1)//we got a match  
                          {  
                               if(size == 2)  
                               {  
                         
                            	   ArrayList<Integer> answer = new ArrayList<Integer>();  
                                   
                            	   answer.add(test.get(0));  
                                   
                            	   answer.add(parent);  
                                   
                            	   return answer;  
                               
                               }
                               
                               ArrayList<Integer> answer = getMinimumMatch(test, size-1);  
                               
                               answer.add(parent);  
                               
                               if(answer.size() == size)  
                               {  
                               
                            	   return answer;  
                               
                               }  
                          }  
                     }  
                }  
           }  
           
           return new ArrayList<Integer>();  
      
      }  
      /**  
       * Checks whether a number is prime or not  
       * @param num  
       * @return  
       */  
      public static boolean isPrimeBrute(int num)  
      {  
           boolean is_prime = true;  
      
           double sqrt = Math.sqrt(num);  
           
           for(int i=2; i <= sqrt; ++i)  
           
           {  
                int mod = num % i;  
           
                if(mod==0)  
                {  
                
                	is_prime = false;  
                    
                	break;  
                }  
           }  
           
           return is_prime;  
      
      }  
      /**  
       * Lazy load primes.  
       * @param num  
       * @return  
       */  
      public static boolean isPrime(int num)  
      {  
           Boolean is_prime = primes.get(new Integer(num));  
      
           if(is_prime == null)  
           {  
           
        	   is_prime = new Boolean(isPrimeBrute(num));  
               
        	   primes.put(new Integer(num), is_prime);  
           
           }  
           
           return is_prime.booleanValue();  
      
      }  
        
 }  