class exercise{
    public static void main(String[] args) {
        int numOfApples=123;  //사과 개수
        int sizeOfBucket=10;  //한 바구니에 들어갈 수 있는 수
        int numOfBucket=(numOfApples+sizeOfBucket)/sizeOfBucket;/* 바구니의 최대 개수를 구하는 것이므로 사과개수에 
        한 바구니에 들어갈수있는 개수를 더해서 넘치게 만든다음 나누어서 개수를 구한다. */
        System.out.println("필요한 바구니의 수: "+ numOfBucket);//출력
    }
}