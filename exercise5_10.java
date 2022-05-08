class exercise5_10
{
    public static void main(String[] args) {
        char[] abcCode = {
            '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
            '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
            '}', ';', ':', ',', '.', '/'
};// 문자배열 abcCode를 선언하고 초기화
char[] numCode = {
            'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'
};// 문자배열 numCode를 선언하고 초기화

String src = "abc123";// 배열 src에 대한 선언과 초기화
String result = "";// 배열 result에 대한 선언과 초기화

// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
for (int i=0; i<src.length(); i++) {// i가 0보다크고 배열src의 길이만큼 증가하며 그동안 for문은 끊기지 않는다.
char ch = src.charAt(i);// 문자열src를 하나하나 짤라서 검산
if ('a'<=ch && ch<='z') result += abcCode[ch-'a'];// 만약 ch가 a보다 크고 z보다 작으면 아래 계산
else if ('0'<=ch && ch<='9') result += numCode[ch-'0'];// 만약 ch가 0보다 크고 9보다 작으면 아래 계산
}
System.out.println("src : " + src);// src출력
System.out.println("result : " + result);// result출력
}
    }
}// 이 코드는 암호화 시키는 프로그램이다.