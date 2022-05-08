class execise5_8{
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};//answer배열에 대한 선언과 {1,4,4,3,1,4,4,2,1,3,2}으로 초기화
		int[] counter = new int[4];//int배열에 대한 번지수, 총 4칸
		
		for (int i=0; i<answer.length; i++) {//i는 0부터 answer배열의 길이까지 증가하며 그동안 for문은 계속해서 돌아간다
			counter[answer[i]-1]++;//counter배열안의 값을 계속바꾸어 별의 개수를 지정해주는 코드
		}
		
		for (int i=0; i<counter.length; i++) {//i는 0부터 시작하여 counter배열의 길이까지 증가하며 그동안 for문은 계속해서 돌아간다
			System.out.printf("%d의 개수: %d개 > ", i+1, counter[i]);
			for (int j=0; j<counter[i]; j++) {//j는 0부터 시작하여 counter배열의 길이까지 증가하며 그동안 for문은 계속해서 돌아간다
				System.out.print("*");//*출력
			}
			System.out.println();//줄바꿈 출력
		}
}
}// 배열에 담긴 데이터를 읽고 숫자를 세어서 *을 찍어서 그래프를 그리는 코드
