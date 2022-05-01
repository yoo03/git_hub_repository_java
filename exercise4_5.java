class exercise4_5
{
    public static void main(String[] args) {
        int i = 0;//변수 i초기화
        int j = 0;//변수 j초기화
        while(i<=10){//while은 i가 10이하일때까지 계속돈다
            j=0;//변수 j 0으로 다시 초기화
            while(j<=i){//while은 j가 i이하일때까지 계속돈다
            System.out.print("*");//*를 출력한다
            j++;//j증가
        }
        System.out.println();//줄바꿈
        i++;//i증가
    }   
    }
}