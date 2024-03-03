package array_txt;



public class array2D {

    static void sumArray(int[][] array){
        int sum;
        for(int i = 0; i < 3; i++){
            sum = 0;
            for(int j = 0; j < 4; j++)
                sum += array[i][j];
            System.out.println(sum);
        }
    }
    public static void main(String[] args){
        int[][] array = {
                {5,2,6,4},
                {6,8,4,1},
                {7,9,5,8}
        };
        sumArray(array);
    }
}
