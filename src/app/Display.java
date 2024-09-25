package app;

import java.util.List;
import java.util.Set;

public class Display {
    public void displayResult(int strikeCount, int ballCount){
        if (strikeCount == 3) {
            System.out.println("정답입니다!");
        } else if (strikeCount == 0 && ballCount == 0) {
            System.out.println("아웃");
        } else {
            System.out.println(strikeCount + "스트라이크 " + ballCount +"볼");
        }
    }

    public void displayStartGame() {
        System.out.println("숫자 야구 게임 시작!");
    }

    public void displayGameProgress() {
        System.out.print("숫자를 입력하세요: ");
    }

    public void displayAnswer(Set<Integer> answer) {
        System.out.println(answer);
    }

    /* Level 2 */
    public void displayController() {
        System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
        System.out.println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
    }

    public void displayEndGame() {
        System.out.println("게임을 종료합니다!");
    }

    /* Level 3 */
    public void displayHistory(List<Integer> gameHistory) {
        for (int i = 0; i < gameHistory.size(); i++) {
            System.out.println((i + 1) + "번째 게임 : 시도 횟수 " + gameHistory.get(i));
        }
    }
}
