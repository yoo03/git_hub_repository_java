class exercise5_6{
    public static void main(String[] args) {
        int[] coinUnit={500, 100, 50, 10};//coinUnit 배열에 대한 정의

        int money=2680;//변수의 초기화및 재정의
        System.out.println("money="+money);//money의 값을 받고 출력

        for (int i=0;i<coinUnit.length; i++){//i는 0부터 coinUnit배열의 길이만큼 증가하며 그동안 for문은 지속된다 
            System.out.printf("%d원 : %d\n", coinUnit[i], money/coinUnit[i]);//배열과 money에 배열을 나눈값을 받아 출력
            money%=coinUnit[i];//돈을 지불하고 남은 나머지를 계산하는 코드
        }
    }
}//이 코드는 어떠한 조합의돈으로 목표치의 돈을 낼수있는지 알려주는 코드이다