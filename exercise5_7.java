class exercise5_7
{
    public static void main(String args[]) {
        if(args.length!=1){// arg배열의 길이가 1이 아닐경우에
            System.out.println("USAGE: java exercise5_7 3120");//출력
            System.exit(0);//프로그램종료?
        }

        int money = Integer.parseInt(args[0]);//int로 형변형을 시켜서 배열 0번지에 입력하게한다

        System.out.println("money="+money);//money변수의 변수값을 받아 출력한다

        int[] coinUnit ={500, 100, 50, 10};//coinUnit배열의 선언 및 500, 100, 50, 10으로 초기화
        int[] coin={5,5,5,5};//coin배열의 선언 및 5,5,5,5로 초기화

        for(int i=0;i<coinUnit.length;i++)//i는 0부터 시작해서 coinUnit배열의 길이만큼 증가하고 그동안 for문은 계속해서 돈다
        {
            int coinNum=0;//변수 coinNum에 대한 정의
          coinNum=money/coinUnit[i]<coin[i]?money/coinUnit[i]:coin[i];//삼항 연산자로서 금액을 동전단위로 나눠서 그게 개수보다 작으면 금액에 동전단위로 나눈 값을, 크면 동전의 개수를 선택한다
            coin[i]-=coinNum;// coinNum의 값을 배열에서 계속해서 빼주고
        money-=(coinNum*coinUnit[i]);// coinNum*coinUnit[i]의 값을 money에서 빼준다
            System.out.println(coinUnit[i]+"원: "+coinNum);// 출력
        }

        if(money >0){//money가 0보다 크면
        System.out.println("거스름돈이 부족합니다.");//출력
        System.exit(0);//프로그램종료
        }

        System.out.println("=남은 동전의 개수?");// 출력

        for(int i=0;i<coinUnit.length;i++)// i는 0부터 시작해서 coinunit의 길이만큼 계속증가하고 그때까지 for문은 계속해서 돈다
        System.out.println(coinUnit[i]+"원: "+coin[i]);// 배열안에 있는 값 출력
    }// 이코드는 문제 5_6에서 동전의 개수를 추가한 프로그램이다
}