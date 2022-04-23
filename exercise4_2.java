class exercise4_2
{
    public static void main(String[] args) {
        int sum=0;//sum을 초기화후 재정의
        for(int i=0; i<=20; i++)//i가 0부터 20이 될때까지 계속해서 이 for문은 돈다.
        {
            if(i%2!=0 && i%3!=0)//i를 2로나누었을때 나머지가 0이 아니거나 i를 3으로 나누었을때 나머지가 0이아닌경우를 둘다만족할때
            {
                sum+=i;//sum에 i의 값을 더해준다
            }
        }
        System.out.print(sum);//sum을 받아서 출력
        
    }
}