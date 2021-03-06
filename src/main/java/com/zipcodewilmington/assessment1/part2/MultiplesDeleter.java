package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
//        for (int i = 0; i < ints.length; i++)
//            if (ints[i] % 2 == 0) {
//                int =ArrayUtils.removeValue(ints, ints[i]);
//            }
//        return ints;
//    }
        return null;

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
   public Integer[] deleteOdds(Integer[] ints) {
    return null;}
        //        for (int i = 0; i < ints.length; i++)
//            if (ints[i] % 2 == 1) {
//                int = ArrayUtils.removeValue(ints, ints[i]);
//            }
//    }
//       return int;
//}

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList <Integer> buffer = new ArrayList<>();
        for(Integer entry : ints) {
            if(!(entry % 3 == 0)){
            buffer.add(entry);
            }
        }
        ints =buffer.toArray(new Integer[buffer.size()]);
        return ints;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer>buffer = new ArrayList<>();
        for(Integer entry:ints){
            if (!(entry % multiple == 0)){
                buffer.add(entry);
            }
        }
        ints = buffer.toArray(new Integer[buffer.size()]);
        return ints;
    }
}
