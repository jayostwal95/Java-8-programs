//Java Program to get the maximum and minimum from a list
package collection;

import java.util.Comparator;
import java.util.stream.*;

public class MinimumMaximum {
	 public static void main(String args[]) {

	        //getting max number
	        Integer maxnum = Stream.of(10, 13, 4, 9, 2, 20)
	                .max(Comparator.comparing(Integer::valueOf))
	                .get();

	        //getting min number
	        Integer minnum = Stream.of(10, 13, 4, 9, 2, 20)
	                .min(Comparator.comparing(Integer::valueOf))
	                .get();

	        System.out.println("Max number is: " + maxnum);
	        System.out.println("Min number is: " + minnum);
	    }
	}