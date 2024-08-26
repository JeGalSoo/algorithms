import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class sdf {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            List<String> candidate = new ArrayList<>();
            candidate.add("빈값");
            List<Integer> cnt = new ArrayList<>();
            cnt.add(0);
            System.out.print("총 진행할 토표수를 입력해 주세요.");
            int total = sc.nextInt();
            System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.printf("%d번째 후보자이름을 입력해 주세요.",i);
                candidate.add(i,sc.next());
                cnt.add(i,0);
            }
            for (int i = 1; i <= total; i++) {
                int rand = random.nextInt(num)+1;
                cnt.set(rand, cnt.get(rand) + 1);
                System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s\n", (i / (double) total) * 100, i, candidate.get(rand));
                for (int j = 1; j <= num; j++) {
                    System.out.printf("[기호:%d] %-10s%.2f%%\t(투표수: %d)\n", j, candidate.get(j)+":", cnt.get(j) / (double) total * 100, cnt.get(j));
                }
                System.out.println();
            }
        }
    }
}
