package com.project.euler.problem;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.euler.feature.Reader;

public class _054PokerHands {

	static Logger logger = Logger.getLogger(_054PokerHands.class);

	int club = 1, diamond = 2, heart = 3, spade = 4;

	public Object solve() {

		int count = 0;

		List<String> datas = new Reader().readFile("poker.txt");

		for (Iterator<String> iterator = datas.iterator(); iterator.hasNext();) {
			String data = (String) iterator.next();
			String set1 = data.substring(0, 15);

			String set2 = data.substring(15);

			boolean isPlayer1Won = isPlayer1Won(set1, set2);

			if (isPlayer1Won) {

				count++;
			}
		}

		return Integer.valueOf(count);
	}

	private boolean isPlayer1Won(String set1, String set2) {

		int[] numbers1 = new int[5];

		int[] numbers2 = new int[5];

		POKER poker1 = whichPoker(numbers1, set1);

		POKER poker2 = whichPoker(numbers2, set2);

		numbers1 = getCNO(numbers1);
		numbers2 = getCNO(numbers2);

		boolean result = false;

		if (poker1.ordinal() > poker2.ordinal()) {
			result = true;
		} else if (poker1.ordinal() == poker2.ordinal()) {
			int[] cnos = new int[2];

			switch (poker1) {

			case ROYALFLUSH:
				result = true;
				break;

			case STRAIGHTFLUSH:

				if (numbers1[4] >= numbers2[4]) {

					result = true;

				}

				break;

			case FOUROFAKIND:

				cnos = assignN1AndN2(numbers1[0], numbers2[0]);

				if (cnos[0] > cnos[1]) {

					result = true;

				}

				break;

			case FULLHOUSE:

				cnos = assignN1AndN2(numbers1[0], numbers2[0]);
				if (cnos[0] > cnos[1] || (cnos[0] == cnos[1] && numbers1[3] >= numbers2[3])) {

					result = true;

				}
				break;

			case FLUSH:

			case HIGHCARD:

				for (int i = numbers1.length - 1; i >= 0; i--) {

					cnos = assignN1AndN2(numbers1[i], numbers2[i]);

					if (cnos[0] > cnos[1]) {

						result = true;

					} else if (cnos[0] == cnos[1]) {
						continue;

					} else if (cnos[0] < cnos[1]) {

						break;

					}
				}

				break;

			case STRAIGHT:

				cnos[0] = numbers1[0];

				cnos[1] = numbers2[0];

				int cnof10 = numbers1[1];

				int cnof20 = numbers2[1];

				if (cnof10 == 10) {
					cnos[0] = resetA(cnos[0]);
				}

				if (cnof20 == 10) {

					cnos[1] = resetA(cnos[1]);

				}

				if (cnos[0] >= cnos[1]) {

					result = true;

				}

				break;

			case THREEOFAKIND:

				cnos = assignN1AndN2(numbers1[0], numbers2[0]);

				if (cnos[0] > cnos[1]) {

					result = true;

				} else if (cnos[0] == cnos[1]) {
					cnos = assignN1AndN2(numbers1[3], numbers2[3]);
					if (cnos[0] > cnos[1]) {
						cnos = assignN1AndN2(numbers1[4], numbers2[4]);

						if (cnos[0] >= cnos[1]) {

							result = true;

						}
					}
				}

				break;

			case TWOPAIRS:

				cnos = assignN1AndN2(numbers1[0], numbers2[0]);
				if (cnos[0] > cnos[1]) {

					result = true;

				} else if (cnos[0] == cnos[1]) {
					cnos = assignN1AndN2(numbers1[2], numbers2[2]);
					if (cnos[0] > cnos[1]) {
						result = true;
					} else {
						cnos = assignN1AndN2(numbers1[4], numbers2[4]);
						if (cnos[0] >= cnos[1]) {
							result = true;
						}
					}

				}

				break;

			case ONEPAIR:

				cnos = assignN1AndN2(numbers1[0], numbers2[0]);
				
				if (cnos[0]>cnos[1]) {

					result = true;

				} else if (cnos[0] == cnos[1]) {

					cnos = assignN1AndN2(numbers1[2], numbers2[2]);
						
					if (cnos[0]>cnos[1]) {

						result = true;

					} else if (cnos[0] == cnos[1])
					{
						
						cnos = assignN1AndN2(numbers1[3], numbers2[3]);
						if (cnos[0]>cnos[1]) {

							result = true;

						}
						else 
						{
							cnos = assignN1AndN2(numbers1[4], numbers2[4]);
							if (cnos[0]>cnos[1]) {

								result = true;

							}

						}
						
						
					}

				}

				break;

			default:
				break;

			}
		}

		return result;
	}

	private POKER whichPoker(int[] numbers, String set) {

		set = set.replace("A", "1").replace("K", "13").replace("Q", "12").replace("T", "10").replace("J", "11")
				.replace("C", "1").replace("D", "2").replace("H", "3").replace("S", "4");

		String[] cards = set.split(" ");

		for (int i = 0; i < cards.length; i++) {

			numbers[i] = Integer.parseInt(cards[i]);

		}

		Arrays.sort(numbers);

		boolean isColor = true;

		boolean isOrder = true;

		boolean isStartWithA = false;

		int firstpair = 0;

		int secondpair = 0;

		int firstpaircount = 1;

		int secondpaircount = 1;

		boolean isFirstDone = false;

		POKER poker = POKER.HIGHCARD;

		int result = numbers[0] - (numbers[0] / 10) * 10;

		int sequence = (numbers[0] - (numbers[0] % 10)) / 10;

		int pair = sequence;

		for (int i = 0; i < numbers.length; i++) {

			int cno = getCNO(numbers[i]);

			int ctype = numbers[i] - (numbers[i] / 10) * 10;

			if (cno == 1 && i == 0) {

				isStartWithA = true;

			}

			if (isOrder && i > 0) {

				if (sequence == 1 && cno == 10) {

					sequence = cno;

				} else if (cno - sequence == 1) {

					sequence = cno;

				} else {

					isOrder = false;

				}
			}

			if (isColor && result > -1) {

				if (ctype == result) {

					isColor = true;
				} else {

					isColor = false;

					result = -1;

				}
			}

			if (i == 1) {

				if (cno == pair) {

					if (!isFirstDone) {

						firstpair = cno;

						firstpaircount++;

					}
				} else {

					pair = cno;

				}

			} else if (i > 1) {

				if (cno == pair) {

					if (!isFirstDone) {

						firstpair = cno;

						firstpaircount++;

					} else {

						secondpair = cno;

						secondpaircount++;

					}
				} else {
					if (!isFirstDone && firstpair > 0) {

						isFirstDone = true;

					}

					pair = cno;

				}

			}

		}

		/*
		 * Color Check : Royal Flush, Straight Flush, Flush Order Check : Royal
		 * Flush, Straight Flush, Straight Pair Check : Full House, Four Of A
		 * Kind,Three of A Kind, Two Pairs, One Pairs High Card : Everything
		 * except Royal Flush
		 */

		if (isOrder && isColor) {

			if (isStartWithA) {

				if ((numbers[1] - (numbers[1] % 10)) / 10 == 10) {

					poker = POKER.ROYALFLUSH;

				}

			} else {

				poker = POKER.STRAIGHTFLUSH;

			}

		} else if (isOrder) {

			poker = POKER.STRAIGHT;

		} else if (isColor) {

			poker = POKER.FLUSH;

			if (isStartWithA) {

				int temp = numbers[0];

				numbers[0] = numbers[1];

				numbers[1] = numbers[2];

				numbers[2] = numbers[3];

				numbers[3] = numbers[4];

				numbers[4] = temp;
			}

		} else if (firstpair > 0) {

			if (secondpair == 0) {

				if (firstpaircount == 4) {

					poker = POKER.FOUROFAKIND;

					int temp[] = new int[4];

					int tempi = 0;

					int extra = 0;

					for (int i = 0; i < numbers.length; i++) {

						int cno = getCNO(numbers[i]);

						if (cno != firstpair) {

							extra = numbers[i];

						} else {

							temp[tempi++] = numbers[i];

						}

					}

					for (int i = 0; i < temp.length; i++) {

						numbers[i] = temp[i];

					}

					numbers[4] = extra;

				} else if (firstpaircount == 3) {

					poker = POKER.THREEOFAKIND;

					int[] temp = new int[2];

					int[] triplet = new int[3];

					int tempi = 0;

					int tripleti = 0;

					for (int i = 0; i < numbers.length; i++) {

						int cno = getCNO(numbers[i]);

						if (cno != firstpair) {

							temp[tempi++] = numbers[i];

						} else {

							triplet[tripleti++] = numbers[i];

						}

					}

					for (int i = 0; i < triplet.length; i++) {

						numbers[i] = triplet[i];

					}

					int j = 0;

					for (int i = temp.length - 1; i >= 0; i--) {

						numbers[3 + j++] = temp[i];

					}

				} else {
					poker = POKER.ONEPAIR;

					int[] temp = new int[3];

					int[] dual = new int[2];

					int tempi = 0;

					int duali = 0;

					for (int i = 0; i < numbers.length; i++) {

						int cno = getCNO(numbers[i]);

						if (cno != firstpair) {

							temp[tempi++] = numbers[i];

						} else {

							dual[duali++] = numbers[i];

						}

					}

					for (int i = 0; i < dual.length; i++) {

						numbers[i] = dual[i];

					}

					int j = 0;

					for (int i = temp.length - 1; i >= 0; i--) {

						numbers[2 + j++] = temp[i];

					}

				}

			} else {

				if (secondpaircount == 3) {

					int[] first = new int[2];

					int[] second = new int[3];

					int firsti = 0;

					int secondi = 0;

					for (int i = 0; i < numbers.length; i++) {

						int cno = getCNO(numbers[i]);

						if (cno == secondpair) {

							second[secondi++] = numbers[i];

						} else {

							first[firsti++] = numbers[i];

						}

					}

					for (int i = 0; i < second.length; i++) {

						numbers[i] = second[i];

					}

					for (int i = 0; i < first.length; i++) {

						numbers[3 + i] = first[i];

					}

					poker = POKER.FULLHOUSE;

				} else if (firstpaircount == 2 && secondpaircount == 2) {

					if (isStartWithA && firstpair == 1) {

						int temp = secondpair;

						secondpair = firstpair;

						firstpair = temp;

						temp = secondpaircount;

						secondpaircount = firstpaircount;

						firstpaircount = temp;

					}

					int[] first = new int[2];

					int[] second = new int[2];

					int firsti = 0;

					int secondi = 0;

					int extra = 0;

					for (int i = 0; i < numbers.length; i++) {

						int cno = getCNO(numbers[i]);

						if (cno == secondpair) {

							second[secondi++] = numbers[i];

						} else if (cno == firstpair) {

							first[firsti++] = numbers[i];

						} else {

							extra = numbers[i];
						}

					}

					for (int i = 0; i < second.length; i++) {

						numbers[i] = second[i];

					}

					for (int i = 0; i < first.length; i++) {

						numbers[2 + i] = first[i];

					}

					numbers[4] = extra;

					poker = POKER.TWOPAIRS;

				} else if (firstpaircount == 3) {

					int[] first = new int[3];

					int[] second = new int[2];

					int firsti = 0;

					int secondi = 0;

					for (int i = 0; i < numbers.length; i++) {

						int cno = getCNO(numbers[i]);

						if (cno == secondpair) {

							second[secondi++] = numbers[i];

						} else {

							first[firsti++] = numbers[i];

						}

					}

					for (int i = 0; i < first.length; i++) {

						numbers[i] = first[i];

					}

					for (int i = 0; i < second.length; i++) {

						numbers[3 + i] = second[i];

					}

					poker = POKER.FULLHOUSE;

				}
			}
		} else {

			if (isStartWithA) {

				int temp = numbers[0];

				numbers[0] = numbers[1];

				numbers[1] = numbers[2];

				numbers[2] = numbers[3];

				numbers[3] = numbers[4];

				numbers[4] = temp;

			}

		}

		return poker;
	}

	/*
	 * Royal Flush : Contain A Card or not..if contains color check and then
	 * order check.. next Check for k Straight Flush : Order Check and Color
	 * Check Four Of A kind : Number Check Full House : Number Check Flush :
	 * Card Check Straight : Order Check Three Of A kind : Number Check Two
	 * Pairs : Number Check One Pair : Number Check High Card : High Card Check
	 * 
	 * 
	 * Color Check : Royal Flush, Straight Flush, Flush Order Check : Royal
	 * Flush, Straight Flush, Straight Pair Check : Full House, Four Of A Kind,
	 * Three of A Kind, Two Pairs, One Pairs High Card : Everything except Royal
	 * Flush
	 */

	/*
	 * Royal Flush : Contain A Card or not Straight Flush : Order Check and
	 * Color Check Four Of A kind : Number Check Full House : Number Check Flush
	 * : Card Check Straight : Order Check Three Of A kind : Number Check Two
	 * Pairs : Number Check One Pair : Number Check High Card : High Card Check
	 */

	private int resetA(int n) {
		if (n == 1) {

			n = 14;

		}

		return n;

	}

	private int[] assignN1AndN2(int n1, int n2) {

		int[] cnos = new int[2];

		cnos[0] = resetA(n1);
		cnos[1] = resetA(n2);

		return cnos;

	}

	private int getCNO(int n) {

		return (n - (n % 10)) / 10;

	}

	private int[] getCNO(int[] n) {

		for (int i = 0; i < n.length; i++) {
			n[i] = getCNO(n[i]);
		}

		return n;

	}

	public enum POKER {

		HIGHCARD, ONEPAIR, TWOPAIRS, THREEOFAKIND, STRAIGHT, FLUSH, FULLHOUSE, FOUROFAKIND, STRAIGHTFLUSH, ROYALFLUSH
	}
}
