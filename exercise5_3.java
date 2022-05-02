class exercise5_3
{
    public static void main(String[] args) 
    {
    int[] arr ={10, 20, 30, 40, 50};//일차원 배열 arr의 선언 후 {10, 20, 30, 40, 50}으로 초기화
    int sum=0;//변수 sum을 선언후 0으로 초기화
        for(int i=0; i<5; i++){//i는 0부터 4까지 증가하고 그동안 for문은 계속해서 돌아간다
            sum+=arr[i];//배열안에 있는 값이 sum에 계속해서 더해진다
        }
        System.out.println("sum="+sum);//sum값을 받아서 출력한다
    }
}// 이코드는 배열안에 있는값을 다 더하는 코드이다.