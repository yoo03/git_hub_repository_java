class exercise4_7
{
    public static void main(String[] args) {
    int value=(int)(Math.random()*6)+1;/*Math.random을 사용해 난수를 뽑아오고 그 범위를 정하는것은 *6을 이용해 
    0.*** ~ 5.***의 범위로 만들어주고 거기에 1을 더해 1.*** ~ 6.***로 만들어주고 
    int가 정수형이라는것을 이용해 1~6사이의 정수를 random하게 뽑아온다*/
    System.out.println("value:"+value);//value의 값을 받아 그대로 출력한다.
    }
}//이 코드는 범위가 정해진 난수를 가져와서 그것을 그대로 출력하는 코드이다 