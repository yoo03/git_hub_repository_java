class exercise3_6
{
    public static void main(String[] args) {
        int num=24;//변수 num을 선언후 24로 초기화
        System.out.println((num+10)/10*10-num);/*num보다 크면서 가장 가까운 10의 배수에서 
        num값을 빼는 것인데 num보다 크다라는 조건이 아래로 내리는 것을 생각하지않아도되 +10을 해주고 3_4, 3_5처럼 
        int의 정수라는 조건을 이용해 /10*10을하고 -num 을 해준다*/
    }
}//변수 num보다 크면서 가장 가까운 10의 배수에서 변수 num의값을 뺀 나머지를 구하는 코드