public class exercise4_6
{
    public static void main(String[] args) 
    {
        int sum=0;//변수 sum을 선언후 0으로 초기화
        for(int i=1;i<=6;i++)//i가 1부터 시작해서 6까지 증가하고 그때까지 for문은 계속돈다
        {
            for(int j=1;j<=6;j++)//j가 1부터 시작해서 6까지 증가하고 그때까지 for문은 계속돈다 
            {
            sum=i+j; //sum에 i와 j가 더해진다.
            if(sum==6)//sum이 6일때
            System.out.printf("%d, %d\n", i, j);//i와 j의 값을 받아서 출력해준다
            }
            }     
    }
}//이프로그램의 목적은 주사위를 던져서 합이 6이 나오는 경우가 무엇이 있는지 알려주는 코드이다.