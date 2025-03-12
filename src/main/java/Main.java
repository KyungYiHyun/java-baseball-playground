import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int ans = (int) Math.floor(Math.random() * 900 + 100);
        String[] split = String.valueOf(ans).split("");
        System.out.println(Arrays.toString(split));



        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자를 입력해 주세요 : ");
            int input = Integer.parseInt(sc.next());
            if (input == ans){
                System.out.println("정답");
                return;
            }
            String[] inputSplit = String.valueOf(input).split("");
            int strikeCnt = calStrike(inputSplit, split);
            int ballCnt = calBall(inputSplit,split);
            if (strikeCnt == 0 && ballCnt == 0){
                System.out.println("낫싱");
                continue;
            }
            System.out.println(strikeCnt + "스트라이크" + " " + ballCnt + "볼");

        }

    }

    // 스트라이크 계산
    public static int calStrike(String[] num, String[] ans) {
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            if (num[i].equals(ans[i])) {
                temp++;
            }
        }
        return temp;
    }


    // 볼 계산
    public static int calBall(String[] num, String[] ans) {
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                if (num[i].equals(ans[j])) {
                    temp++;
                }
            }
        }

        return temp;


    }

}
