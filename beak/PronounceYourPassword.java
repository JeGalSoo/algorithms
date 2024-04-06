//package beak;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//
//public class PronounceYourPassword {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    public static void main(String[] args) throws IOException {
//
//
//        String[] arr = {"a", "e", "i", "o", "u"};
//        int a = 0;
//        String[] arr1=new String[br.readLine().length()];
//        for(String i:br.readLine()){
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr2[i].equals(arr[i])) {
//                    a += 1;
//                }
//            }
//        }
//        if (a == 0) {
//            System.out.printf("<%s> is not acceptable1", pw);
//            return;
//        }
//        for (int i = 0; i < arr2.length - 1; i++) {
//            if (arr2[i].equals(arr2[i + 1])) {
//                if (arr2[i].equals("e") || arr2[i].equals("o")) {
//                } else {
//                    System.out.printf("<%s> is not acceptable2", pw);
//                    return;
//                }
//            }
//        }
//        for(int i=0;i<arr2.length-2;i++){
//            for(int j=0;j<arr.length;j+=){
//                if(arr2[i].equals(arr[j])&&arr2[i+1].equals(arr[j])){
//                    }
//                }
//            }
//        }
//        System.out.printf("<%s> is acceptable", pw);
//    }
//}
