class exercise3_10
{
    public static void main(String[] args) {
        char ch='A';//변수 ch를 선언후 문자'A'로 초기화, 'A'를 쓰며 문자의 아스키코드화

        char lowerCase=('A'<=ch && ch<='Z')?(char)(ch+32):ch;
        /*삼항연산자를 사용하였고 조건은 문제가 변수 ch에 저장된 문자가 대문자인 경우에 소문자로 변경하는 것이라 일단 조건식에는
        ch의 대문자 확인유무가 들어있고 참에는 대문자와 소문자의 아스키코드의 간격인 32를 더해주고 문자인 char형으로 형변환 시켜주며
        거짓일경우에는 그대로 내보낸다*/

        System.out.println("ch:"+ch);//ch를 받아서 출력
        System.out.println("ch to lowerCase:"+lowerCase);//lowerCase를 받아서 출력
    }
}//대문자를 소문자로 변경하는 코드이다.