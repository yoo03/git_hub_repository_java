class exercise4_15
{
    public static void main(String[] args) 
    {
    int number =12321;// 변수number를 선언하고 12321로 초기화
    int tmp = number;// 변수tmp를 선언하고 number로 초기화(대입)
    
    int result =0;// 변수result를 선언하고 0으로 초기화

    while(tmp !=0){// tmp가 0이 아닐때 계속돌아간다
        result = result*10;// 일단 10을 곱해 초기화시키고 
        result +=tmp%10;// 그것을 나눈 나머지를 result에 더하고 그러면 자리수마다 숫자가 채워진다
        tmp=tmp/10;// tmp/10을 tmp에 대입한다. 자리수를 줄이는 역할을 한다.
    }
    if(number == result)// number와 result가 같을때 if가 돌아간다
        System.out.println(number+"는 회문수입니다.");// 출력
    else
        System.out.println(number+"는 회문수가 아닙니다");// 출력
    }
}// 대입한 숫자가 회문수인지 아닌지 알아보는 코드이다