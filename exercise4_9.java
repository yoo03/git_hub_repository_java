class exercise4_9
{
    public static void main(String[] args) {
        String str="12345";//문자열 str을 선언후 "12345"로 초기화
        int sum=0;//변수 sum을 선언후 0으로 초기화

        for(int i=0; i<str.length();i++)//i는 0부터 시작해서 문자열의 길이인 5만큼까지 돌아가고 그때까지 for문은 돌아간다
        {
            sum+=(str.charAt(i)-'0');/*sum에 str문자열의 문자 하나하나 다 더하고 문자로 되있는 '1','2','3'~ 등이므로
            숫자로 바뀌면 90대의 숫자가 나오기때문에 '0'을 빼 숫자 1,2,3,4,5가 나올수 있게 한다*/
        }
        
        System.out.println("sum="+sum);//sum을 받아 출력한다
    }
}//문자열 str의 12345를 하나하나 다 더하는 코드이다.
//charAt()은 문자열을 하나하나다 검사할수있게 하는 코드이다.