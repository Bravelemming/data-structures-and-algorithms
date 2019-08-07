package code401challenges;

public class ArrayShift {
    public static int[] arrayShift(int[] arrToBeShifted, int intToBeAdded){

        int[] output = new int[arrToBeShifted.length+1];
        int middleIndex = (output.length)/2;
        System.out.println("middle index: " + middleIndex);
        int j = 0;

        for (int i = 0; i < output.length ; i++){
            if(i == middleIndex) {
                output[i] = intToBeAdded;
                i++;
            }
            output[i] = arrToBeShifted[j];
            j++;
        }

//        System.out.println(output);
    return output;
    }
}
