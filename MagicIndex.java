package com.codingchallenges;

public class MagicIndex {


    public int findMagicIndex(int[] A){

        int result = -1;

        for (int i = 0; i < A.length; i++) {

            if(A[i]==i){result = i;}

        }

        if(result == -1){

            System.out.println("No magic index found. returning -1.");


        }

        return result;
    }
}
