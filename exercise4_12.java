class exercise4_12
{
    public static void main(String[] args) 
    {
        int multiply=0;//변수 mutiply를 선언하고 0으로 초기화
        for(int a=2; a<=9; a++){//a는 2부터 시작하여 9까지가고 그동안 for문은 계속해서 돈다
            for(int b=1;b<=3;b++){//b는 1부터 시작하여 3까지가고 그동안 for문은 계속해서 돈다
                multiply=a*b;//multiply는 a와 b의 곱이다
                System.out.printf("%d*%d=%d\n", a, b, multiply);//a,b,multiply의 값을 받아 출력한다
            }
        }
    }
}//이 프로그램은 구구단의 *3까지를 출력하는 코드이다.