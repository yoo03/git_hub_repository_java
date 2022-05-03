class exercise4_4
{
    public static void main(String[] args) {
    int num = 1;// 변수 num을 선언후 1로 초기화
   int sum = 0;// 변수 sum을 선언후 0으로 초기화 
		while (sum<100) {// sum이 100이하일때까지 계속돈다
    		if (num!=1)// num이 1이 아닐때
            System.out.print("+");// +출력
    		System.out.print("("+num+")");// 출력
    		sum += num;// sum에 num을 계속해서 더한다
			num = num>0? -(num+1):-(num-1);// 삼항연산자로서 num이 0보다 크면 참이면 -(num+1)을 실행하고 거짓이면 -(num-1)을 실행한다
    		}
		System.out.println();// 줄바꿈
		System.out.println("sum = " + sum);// 출력
    
}
}// 짝수는 -를 붙이고 홀수는 붙이지 않고 몇까지 더해야 총합 100까지 가는지 알려주는 코드이다.