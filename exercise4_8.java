public class exercise4_8
{
    public static void main(String[] args) {
        int sum=0;//변수sum을 선언 후 0으로 초기화  
        for(int x=0; x<=10; x++){// x가 0부터 10까지있고 for문은 그때까지 계속해서돈다.
            for(int y=0; y<=10;y++){//y는 0부터 10까지있고 for문은 그때까지 계속돈다. 
                sum=2*x+4*y;//sum은 x에 2를 곱하고 y에 4를 곱한것을 더한것이다.
                if(sum==10){//sum이 10일때
                    System.out.printf("x=%d, y=%d\n", x, y);//x와 y의 값을 받아서 출력한다
                }
            }
        }
    }
}//이 코드는 방정식 2x+4y의 x,y의 해를 찾는 코드이다.