class exercise4_3
{
    public static void main(String[] args)
     {
         int sum=0;//변수 sum을 선언하고 0으로 초기화
         int value=0;//변수 value를 선언하고 0으로 초기화
    for(int i=1; i<=10; i++)//i는 1부터 시작해서 10까지 증가하고 그때까지 for문은 계속돈다
     {
      sum+=i;//sum에 i가 계속해서 더해지고
      value+=sum;//그 sum이 value에 계속해서 더해짐
     }   
     System.out.print(value); //value값을 받고 그것을 출력
    }
}//이 프로그램은 1+(1+2)+(1+2+3)+~~~~~를 구하는 프로그램이다.