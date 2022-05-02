class exercise4_4
{
    public static void main(String[] args) {
    int num = 1;// 변수 num을 선언후 1로 초기화
   int sum = 0;// 변수 sum을 선언후 0으로 초기화 
		while (sum<100) {
    		if (num!=1) 
            System.out.print("+");
    		System.out.print("("+num+")");
    		sum += num;
			num = num>0? -(num+1):-(num-1);
    		}
		System.out.println();
		System.out.println("sum = " + sum);
    
}
}