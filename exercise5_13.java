import java.uyil.scanner;

class exercise5_13
{
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone" };// 배열words에대한 선언과 초기화
		
		Scanner scanner = new Scanner(System.in);// 입력기에 대한 정의
		char tmp = ' ';// tmp에 대한 선언과 초기화(빈칸) 임시 변수
		
		for (int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();	// String을 배열char로 변환
				   /*char 배열 question에 담긴 문자의 위치를 임의로 바꿈 */
			for (int j=0; j<question.length; j++) {//j는 0부터 시작해서 question에대한길이까지 증가하고 그동안 for문은 계속해서 돈다
				int index = (int)(Math.random() * question.length);// index에 대한 초기화와 난수생성
				tmp = question[j];//
				question[j] = question[index];// 
				question[index] = tmp;// 값을 바꾸는 과정
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.> ", i+1, new String(question));// 출력
			String answer = scanner.nextLine();// 다음라인에 입력
			
			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if (words[i].equals(answer.trim()))//만약 answer이 word[i]에 있는 값과 같으면
				System.out.printf("맞았습니다.%n%n");// 출력
			else//아니면
				System.out.printf("틀렸습니다.%n%n");// 출력
		}
	}
    }// 단어의 글자위치를 바꿔서 보여준다음 원래단어 맞추기
