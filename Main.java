import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            ArrayList list = new ArrayList();
            int y = 0;
            int a = sc.nextInt();
            if(a == -1) break;
            for (int i=1; i<a; i++){
                if(a%i==0){
                    list.add(i);
                    y+=i;
                }
            }
            if(y==a){
                System.out.print(a + " = ");
                for(int i=0; i<list.size(); i++){
                    if(i==list.size()-1){
                        System.out.println(list.get(i));
                    }else{
                        System.out.print(list.get(i) + " + ");
                    }
                }
            }else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}