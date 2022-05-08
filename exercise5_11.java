class exercise5_11
{
    public static void main(String[] args) {
        int[][] score = {
			{100, 100, 100},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		};// score에 대한 배열 선언 및 초기화
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for (int i=0; i<score.length; i++) {// i는 0부터 시작해서 배열score의 길이만큼 증가하고 그동안 for문은 계속해서 돈다
			for (int j=0; j<score[i].length; j++) {// j는 0부터 시작해서 배열score[i]의 길이만큼 증가하고 그동안 for문은 계속해서 돈다
				result[i][j] = score[i][j];// score의 값을 result에 대입
				result[i][result[i].length-1] += score[i][j];// score의 값을 length에서 1뺀값에 대입 왜냐하면 배열이 1이 더크기 때문에
				result[result.length-1][j] += score[i][j];// 위와동일하게 j값을 대입
			}
			result[result.length-1][result[i].length-1] += result[i][result[i].length-1];// result에 합을더해 총합을 저장
		}
		
		for (int i=0; i<result.length; i++) {//i는 0부터 시작해서 배열result의 길이만큼 증가하고 그동안 for문은 계속해서 돈다
			for (int j=0; j<result[i].length; j++) {//j는 0부터 시작해서 배열result의 길이만큼 증가하고 그동안 for문은 계속해서 돈다
				System.out.printf("%4d", result[i][j]);// 출력
			}
			System.out.println();// 줄바꿈
		}
	}
    }
}