class exercise5_7
{
    public static void main(String args[]) {
        if(args.length!=1){//?
            System.out.println("USAGE: java exercise5_7 3120");//출력
            System.exit(0);//프로그램종료
        }

        int money = Integer.parseInt(args[0]);//int로 형변형을 시켜서 배열 0번지에 입력하게한다

        System.out.println("money="+money);//money변수의 변수값을 받아 출력한다

        int[] coinUnit ={500, 100, 50, 10};//coinUnit배열의 정의
        int[] coin={5,5,5,5};//coin배열의 정의

        for(int i=0;i<coinUnit.length;i++)//i는 0부터 시작해서 coinUnit배열의 길이만큼 증가하고 그동안 for문은 계속해서 돈다
        {
            int coinNum=0;//변수 coinNum에 대한 정의
          coinNum=money/coinUnit[i]<coin[i]?money/coinUnit[i]:coin[i];
            coin[i]-=coinNum;
            money-=(coinNum*coinUnit[i]);
            System.out.println(coinUnit[i]+"원: "+coinNum);
        }

        if(money >0){//money가 0보다 크면
        System.out.println("거스름돈이 부족합니다.");//출력
        System.exit(0);//프로그램종료
        }

        System.out.println("=남은 동전의 개수?");

        for(int i=0;i<coinUnit.length;i++)
        System.out.println(coinUnit[i]+"원: "+coin[i]);
    }
}