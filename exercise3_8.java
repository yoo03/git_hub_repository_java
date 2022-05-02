class exercise3_8{
    public static void main(String[] args) 
    {
        byte a=10;//변수 a를 선언후 10으로 초기화
        byte b=20;//변수 b를 선언후 20으로 초기화
        int c=a+b;//변수 c를 선언후 a+b라는 식으로 초기화

        char ch='A';//변수 ch를 선언하고 문자'A'로 초기화
        ch+=2;//변수 ch는 2증가

        float f =3/2f;//변수 f를 선언하고 3/2로 초기화
        long l=3000l*3000l*3000l;//변수 l을 선언하고 3000l*3000l*3000l로 초기화

        float f2=0.1f;//변수 f2를 선언하고 0.1로 초기화
        double d=0.1;//변수 d를 선언하고 0.1로 초기화

        boolean result = d!=f2;//변수 result를 선언하고 변수 d랑 변수 f2랑 않같은지 검사한다
        
        System.out.println("c="+c);//c 출력
        System.out.println("ch="+ch);//ch 출력
        System.out.println("f="+f);//f 출력
        System.out.println("l="+l);//l 출력
        System.out.println("result="+result);//result 출력
    }
}