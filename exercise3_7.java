class exercise3_7
{
    public static void main(String[] args) {
        int fahrenheit = 100;// 변수 fahrenheit을 선언하고 100으로 초기화
        float celcius = (int)(((fahrenheit-32f)*5/9)*100+0.5)/100f;// 변수 celcius를 선언하고 초기화

        System.out.println("Fahrenheit:"+fahrenheit);// fahrenheit 출력
        System.out.println("Celcius:"+celcius);// celcius 출력
    }
}// 이 코드는 화씨온도를 섭씨온도로 바꾸는 코드이다