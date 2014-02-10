package project.euler;
/*
* Solution to Project Euler problem 26
* By Nayuki Minase
*
* http://nayuki.eigenstate.org/page/project-euler-solutions
* https://github.com/nayuki/Project-Euler-solutions
*/

import java.util.HashMap;
import java.util.Map;


public final class ReciprocalCycles {

   public Integer solve() {
        System.out.println(new ReciprocalCycles().run());
    }


    public String run() {
        int bestNumber = 0;
        int bestLength = 0;
        for (int i = 1000; i > 0; i--) {
            int len = getCycleLength(i);
            if (len > bestLength) {
                bestNumber = i;
                bestLength = len;
            }
        }
        return Integer.toString(bestNumber);
    }


    private static int getCycleLength(int n) {
        Map<Integer,Integer> stateToIter = new HashMap<Integer,Integer>();
        int state = 1;
        int iter = 0;
        while (!stateToIter.containsKey(state)) {
            stateToIter.put(state, iter);
            state = state * 10 % n;
            iter++;
        }
        return iter - stateToIter.get(state);
    }

}