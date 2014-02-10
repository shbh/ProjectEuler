package project.euler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by shashi on 1/30/14.
 */
public class NamesScores {

    public static void main(String[] args)
    {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\names.txt")))
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
                }
                totalsum+=sum*(i+1);

            }
            System.out.println(totalsum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
