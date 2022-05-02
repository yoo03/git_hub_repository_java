public class exercise4_11{
public static void main(String[] args) {
    int num1=1;//변수 num1을 선언하고 1로 초기화
    int num2=1;//변수 num2를 선언하고 1로 초기화
    int num3=0;//변수 num3를 선언하고 0으로 초기화
    System.out.print(num1+","+num2);//num1과 num2를 받아서 출력

    for (int i=0;i<8;i++){//i는 0부터 시작해서 7까지가고 갈동안 for은 계속해서 돈다
        num3=+num1+num2;//num3는 num1과 num2를 계속해서 더한다.
        num1=num2;//num2의 값이 num1으로 옮겨진다
        num2=num3;//num3의 값이 num2로 옳겨진다
        System.out.print(","+num3);//num3를 받아서 출력
    }
}
}//이 코드는 피보니치 수열을 알려주는 코드이다.