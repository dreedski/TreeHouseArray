package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String [] friends = {"Drew", "Josh", "Justin"};
        System.out.println(Arrays.toString(friends));
        System.out.println(friends[1] + " is neat!");
        System.out.println(friends.length);

        for(String friend : friends) {
            System.out.printf("Hey %s. The movie starts at 7, Ill see you there! %n", friend);
        }

        for (int i = 0; i < friends.length; i++) {
            String friend = friends[i];
            System.out.printf("Hey %s! The movie starts at 7, Ill see you there! %n", friend);
        }

        int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};

        for (int i=0; i< bensScoreCard.length; i++){
            System.out.printf("Hole #%d: %d %n",
                    i + 1,
                    bensScoreCard[i]);
         }
    }
}
