import java.util.*;

class exercise5_12
{
    public static void main(String[] args) 
    {
        String[][] words = {
			{"chair", "의자"},
			{"computer", "컴퓨터"},
			{"integer", "정수"}
		};//문자열에 대한 배열 words의 선언과 초기화
		
		Scanner scanner = new Scanner(System.in);//scanner에 대한 정의, 입력기의 정의
		int count = 0;//변수 count에 대한 선언과 초기화
		
		for (int i=0; i<words.length; i++) {//i는 0부터 시작해서 word배열의 길이만큼 증가하고 그동안 for문은 중단되지않는다
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);/*i+1인이유는 번지수가 0부터 시작하기 때문이고
			words[i][0]는 문제를 알려주는 번지수이다. 이 정보들을 받아서 출력한다*/
			
			String tmp = scanner.nextLine();//다음 줄에서 입력받는다는 신호
			
			if (tmp.equals(words[i][1])) {/*if조건문안의 내용은 tmp가 word[i][1]이랑 같은경우, 
				즉 입력받은 것이 지정한 번지수에 있는 정보와 같은경우 실행한다*/
				System.out.printf("정답입니다.%n\n");//출력
				count++;//count의 증가
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);//정답을 알려주는 코드
			}
		}
		
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.%n", words.length, count);/* 정답의 개수를 알려주는 코드
		if에서 정답으로 맞았을때만 count가 증가하기때문에 확인하기 편하다*/
    }
}//문제를 풀고 얼마나 맞았는지 알려주는 코드이다.