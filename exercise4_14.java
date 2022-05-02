class exercise4_14
{
    public static void main(String[] args) {
        int answer=(int)(Math.random()*100)+1;//100까지 범위의 랜덤상수를 answer를 초기화시키고 재정의하면서 넣기
        int input =0;//변수 input을 선언하고 0으로 초기화
        int count =0;//변수 count를 선언하고 0으초 초기화

        java.util.Scanner s= new java.util.Scanner(System.in);//Scanner에 대한 정의

        do{//do while문의 시작
            count++;//count증가
            System.out.print("1과 100사이의 값을 입력하세요");//출력
            input = s.nextInt();//int로 형변환후 입력

            if(input>answer){//input이 answer보다 크면 
                System.out.println("더 작은 수를 입력하세요.");//출력
            }else if(input<answer){//input이 answer보다 작으면
                System.out.println("더 큰수를 입력하세요.");//출력
            }
            else if(input==answer){//input이 answer하고 같으면
                System.out.println("맞췄습니다");//출력
                System.out.println("시도횟수는"+count+"번입니다.");//count를 받아 출력
            }
        }while(true);//무한반복
    }
}//이 코드는 무작위의 상수를 몇번안에 맞추는 지에 대한 코드이다.