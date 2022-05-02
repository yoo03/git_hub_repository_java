class exercise5_4
{
    public static void main(String[] args) {
        int[][] arr={
            { 5, 5, 5, 5, 5},
            { 10, 10, 10, 10, 10},
            { 20, 20, 20, 20, 20},
            { 30, 30, 30, 30, 30}
    };/*2차원배열 arr의 선언 후  
    { 5, 5, 5, 5, 5},
    { 10, 10, 10, 10, 10},
    { 20, 20, 20, 20, 20},
    { 30, 30, 30, 30, 30}로 초기화*/

    int total =0;//변수 total을 선언 후 0으초 초기화  
    float average =0;//변수 average를 선언 후 0으로 초기화

    for(int i=0; i<arr.length; i++){//i는 0부터 시작해 배열의 길이까지 증가하며 그동안 for문은 계속해서 작동한다
        for(int j=0; j<arr[i].length;j++){//j는 0부터 시작해 배열의 아래길이까지 증가하며 그동안 for문은 계속해서 작동한다
        total+=arr[i][j];//total에 배열의 모든값을 다더한다.
        average=total/(float)arr[i].length;/*total의 값에 배열의 길이를 나누어 평균을 구한다. 
        또한 배열은 정수형이므로 실수형으로 형변환 시켜준다.*/
        }
    }
    System.out.println("total="+total);//total값을 받아서 출력
    System.out.println("average="+average);//averager값을 받아서 출력
    }
}//2차원 배열 arr에 담긴 모든값의 총합과 평균을 구하는 코드이다