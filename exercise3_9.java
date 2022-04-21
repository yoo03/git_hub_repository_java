class exercise3_9
{
    public static void main(String[] args) {
        char ch='z';
        boolean b=('0'<=ch && ch<='9' || 'a'<=ch && ch<='z'|| 'A'<=ch && ch<='Z') ;

        System.out.println(b);
    }
}