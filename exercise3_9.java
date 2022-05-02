class exercise3_9
{
    public static void main(String[] args) {
        char ch='z';//문자 z가 아닌 아스키코드 z로 변형, 변수 ch를 선언하고 문자 'z'로 초기화
        boolean b=('0'<=ch && ch<='9' || 'a'<=ch && ch<='z'|| 'A'<=ch && ch<='Z') ;
        /*boolean이기 때문에 결과값은 true or false로 나누어서 나오고 문제가 변수ch가 영문자이거나 숫자일때만 
        true가 나오는 조건이고 아스키코드로 ch가되있기 때문에 똑같이 ''를 써서 아스키코드화 시키고 
        || (or)기호를 사용해 또는 을 표현한다*/ 
        System.out.println(b);//b를 받아 출력
    }
}//변수 ch가 영문자나 숫자일때만 변수 b의 값이 true가 되게하는 코드