class exercise4_10
{
    public static void main(String[] args) {
        int num = 12345;// 변수 num을 선언하고 12345로 초기화 
        int sum = 0;// 변수 sum을 선언하고 0으로 초기화
        
        while(num!=0){// num이 0이 아닐때에는 계속해서 반복한다
            sum += num%10;// sum에 num을 10으로 나눈것을 계속해서 더한다
            num = num/10;//  num을 num/10으로 다시 초기화한다
        }
        
        System.out.println("sum="+sum);// sum을 출력한다
    }
}// 문자열을 하나하나 나누어서 각 자리의 숫자를 다더한것을 나타내는 코드다.
//문자열 String을 사용하는것은 v2로 만든다