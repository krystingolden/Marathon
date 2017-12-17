package com.pluralsight;

public class Main {

    /*
https://ocw.mit.edu/courses/electrical-engineering-and-computer-science
/6-092-introduction-to-programming-in-java-january-iap-2010/assignments/

Assignment #3 Marathon
 */

    public static void main(String[] args) {
        int tempTime = 0;
        String tempName = "";

        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };


        for (int i = 0; i < names.length; i++) {
            if (times[i] > tempTime) {
                tempTime = times[i];
                tempName = names[i];
            }
        }
        System.out.println(tempName + " is the fastest runner with a time of " + tempTime);
        int fastestTime = tempTime;
        tempTime = 0;

        for (int i = 0; i < names.length; i++) {
            if (times[i] != fastestTime && times[i] > tempTime) {
                tempTime = times[i];
                tempName = names[i];
            }
        }
        System.out.println(tempName + " is the next fastest runner with a time of " + tempTime);

        for (int i = 0; i < names.length; i++) {
            if (times[i] < tempTime) {
                tempTime = times[i];
                tempName = names[i];
            }
        }
        System.out.println(tempName + " is the slowest runner with a time of " + tempTime);
    }
}
