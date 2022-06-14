import java.util.*;

class Main {
  public static void main(String[] args) {
    
    //  	Declare an array and populate it with the values above using an initializer list
        int [] numbers = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};

        Set<Integer> numbeSet = new HashSet<>();

        //Using a for loop, add each value in the array to a set.
        for (int i = 0; i < numbers.length; i++){
            numbeSet.add(numbers[i]);
        }//for
        System.out.println("number of set from array\n" + numbeSet);

        //Using another for loop, add each value in the array multiplied by 3 to a new set.
        Set<Integer> newNumbeSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++){
            newNumbeSet.add(numbers[i] * 3);
        }//for
        System.out.println("\nnumber of set from array with each value in the array multiplied by 3\n" +newNumbeSet);

  }
}