class exercise4_12
{
    public static void main(String[] args) 
    {
        int multiply=0;
        for(int a=2; a<=9; a++){
            for(int b=1;b<=3;b++){
                multiply=a*b;
                System.out.printf("%d*%d=%d\n", a, b, multiply);
            }
        }
        
    }
}