class execise5_8{
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};//answer배열에 대한 선언과 {1,4,4,3,1,4,4,2,1,3,2}으로 초기화
		int[] counter = new int[4];//int배열에 대한 번지수, 총 4칸
		
		for (int i=0; i<answer.length; i++) {//i는 0부터 answer배열의 길이까지 증가하며 그동안 for문은 계속해서 돌아간다
			counter[answer[i]-1]++;//
		}
		
		for (int i=0; i<counter.length; i++) {//i는 0부터 시작하여 counter배열의 길이까지 증가하며 그동안 for문은 계속해서 돌아간다
			System.out.printf("%d의 개수: %d개 > ", i+1, counter[i]);
			for (int j=0; j<counter[i]; j++) {//j는 0부터 시작하여 counter배열의 길이까지 증가하며 그동안 for문은 계속해서 돌아간다
				System.out.print("*");//*출력
			}
			System.out.println();//출력
		}
}
}//
