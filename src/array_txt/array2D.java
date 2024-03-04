package array_txt;



public class array2D {

    static void reverseArray(Integer[][] array){
        System.out.println("Reversed array:");
        for(int i = 0; i < array.length; i++){
            for(int j = array[i].length - 1; j >= 0; j--){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sumArray(Integer[][] array){
        int sum = 0;
        System.out.println("Total hasil array:");
        for(Integer[] innerArray : array)
            for(int i : innerArray)
                sum += i;
        System.out.println(sum);
    }

    static void sumRow(Integer[][] array){
        int sum;
        for(int i = 0; i < array.length ; i++){
            sum = 0;
            for(int j = 0; j < array[i].length; j++)
                sum += array[i][j];
            System.out.print("Total array[" + i + "] = ");
            System.out.println(sum);
        }
    }

//    static void colLength(Integer[][] array){
//        int length;
//
//        for(int i = 0; i < array.length ; i++){
//            length = 0;
//            for(int j = 0; j < array[i].length; j++)
//                length += 1;
//            System.out.println(length);
//            sumCol(array, length);
//
//        };


//    }

    static void sumCol(Integer[][] array){
        int sum;
        for (int i = 0; i < array[0].length ; i++){
            sum = 0;
            for (int j = 0 ; j < array.length;  j++)
//                if(i < array[j].length)
                sum += array[j][i];
            System.out.println("Total kolom ke-" + (i+1) + " = " + sum);
        }
    }


    public static void main(String[] args){
        Integer [][] array = {
                {5,2,9,4},
                {6,8,4,1},
                {7,9,5,8}
        };
        sumCol(array);
        sumRow(array);
        reverseArray(array);
    }
}
