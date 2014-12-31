package com.project.euler.problem; 
import org.apache.log4j.Logger;



/**
 * Created by shashi on 1/30/14.
 */
public class _018MaximumPathSumI  {

	static Logger logger = Logger.getLogger(_018MaximumPathSumI.class);

	public Integer solve() {
		String text = 
				"75\n" 
				+ "95 64\n" 
				+ "17 47 82\n" 
				+ "18 35 87 10\n"
				+ "20 04 82 47 65\n" 
				+ "19 01 23 75 03 34\n"
				+ "88 02 77 73 07 63 67\n" 
				+ "99 65 04 28 06 16 70 92\n"
				+ "41 41 26 56 83 40 80 70 33\n"
				+ "41 48 72 33 47 32 37 16 94 29\n"
				+ "53 71 44 65 25 43 91 52 97 51 14\n"
				+ "70 11 33 28 77 73 17 78 39 68 17 57\n"
				+ "91 71 52 38 17 14 91 43 58 50 27 29 48\n"
				+ "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n"
				+ "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

		String[] texts = text.split("\n");
		
		int x = texts.length;

		int y = texts[x - 1].split(" ").length;

		int[][] chunks = new int[x][y];

		for (int i = 0; i < x; i++) {
		
			String[] chunk = texts[i].split(" ");
			
			for (int j = 0; j < y; j++) {
			
				if (j < chunk.length) {
			
					chunks[i][j] = new Integer(chunk[j]);
			
				} else {
			
					chunks[i][j] = 0;
			
				}

			}
		}

		for (int j = y - 2; j >= 0; j--) {
			
			for (int i = x - 2; i >= 0; i--) {
			
				int right = chunks[i][j] + chunks[i + 1][j + 1];
		
				int left = chunks[i][j] + chunks[i + 1][j];
		
				chunks[i][j] = left > right ? left : right;

			}
		}
		
		return chunks[0][0];

	}

	

}
