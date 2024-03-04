package array_txt;

import java.util.*;

public class arrayStructure {

//    static int[][] numArray = {{1,2,3,4}, {1,2,3,4,}};

//    static void showArray(){
//        for (int[] ints : numArray) {
//            for (int j = 0; j < ints.length; j++) {
//
//                System.out.println(ints[j]);
//            }
//        }
//    }

    static void fillArray(Integer [] numbers){
        System.out.println(Arrays.toString(numbers));
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            System.out.println(Arrays.toString(numbers));
        }

        System.out.println("Ketik operasi yang diinginkan: ");
        System.out.println("Total dari array = jumlah");
        System.out.println("Membalikkan susunan dari array = reverse");
        input.nextLine();
        String choice = input.nextLine();

        switch (choice){
            case "jumlah":
                sumArray(numbers);
                break;
            case "reverse":
                reverseArray(numbers);
                break;
            default:
                System.out.println("Operasi gagal");
        }
    }

    static void reverseArray(Integer[] numbers){
//        int n = numbers.length;
//        for(int i = 0; i < n/2; i++){
//            int t = numbers[i];
//            numbers[i] = numbers[n - i - 1];
//            numbers[n - i - 1] = t;
//        }
//
//        System.out.println("Array yang direverse adalah:");
//        for(int j = 0; j < n; j++){
//            System.out.println(numbers[j]);
//        }
        Collections.reverse(Arrays.asList(numbers));
        System.out.println(Arrays.asList(numbers));
    }

    static void sumArray(Integer[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Total penjumlahan array: " + sum);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input panjang array (max 20): ");
        int nilai = input.nextInt();

        System.out.println("Masukkan nilai pada array:");

        while (nilai > 20 || nilai <= 0 ){
            System.out.println("Nilai tidak sesuai");
            nilai = input.nextInt();
        }

        Integer[] numbers = new Integer[nilai];
        fillArray(numbers);
//        showArray();
    }
}
