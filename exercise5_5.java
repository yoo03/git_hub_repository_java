class exercise5_5{
    public static void main(String[] args) {
        int[] ballArr={1,2,3,4,5,6,7,8,9};//ballArr배열에 대한 정의
        int[] ball3= new int[3];//ball3의 주소들어가는 길이는 3

        for(int i=0; i<ballArr.length; i++){//i는 0부터 시작해서 ballArr의 길이만큼 증가하고 그동안 for문은 지속된다
            int j=(int)(Math.random()*ballArr.length);//난수생성, 범위는 ballArr의 길이만큼
            int tmp =0;//값을 스위치 하기위한 임의의 변수 초기화및 정의

            tmp=ballArr[i];//ballArr[i]를 tmp에 적용
            ballArr[i]=ballArr[j];//ballArr[j]를 ballArr[i]에 적용
            ballArr[j]=tmp;//tmp를 ballArr[j]에 적용
        }
        for(int i=0; i<ball3.length;i++){//i는 0부터 시작해서 ball3의 길이만큼 증가하고 그동안 for문은 지속한다
        ball3[i]=ballArr[i];//ballArr[i]의 값을 ball[3]에 적용
        }
       
        for(int i=0; i<ball3.length;i++){//i는 0부터 시작해서 ball3의 길이만큼 증가하고 그동안 for문은 지속한다
            System.out.print(ball3[i]);//ball3[i]의 값을 받아 출력
        }
    }
}// 이코드는 ballArr에서 임의의 수를 뽑아 3개의 수를 나타내는 코드이다.