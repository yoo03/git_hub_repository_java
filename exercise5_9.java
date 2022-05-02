class exercise5_9{
    public static void main(String[] args) {
        char[][] star = {
            {'*', '*', ' ', ' ', ' '},
            {'*', '*', ' ', ' ', ' '},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'}
    };//다차원 배열에 대한 정의

    char[][] result = new char[star[0].length][star.length];

    for (int i=0; i<star.length; i++) {//i는 0부터 시작해서 star배열의 길이까지 증가하고 그동안 for문은 계속해서 작동한다
        for (int j=0; j<star[i].length; j++) {//
            System.out.print(star[i][j]);//star[i][j]의 값을 받아서 출력시킨다
    }
    System.out.println();//출력
}

System.out.println();//출력

for (int i=0; i<star.length; i++) {//i는 0부터 시작해서 star배열의 길이까지 증가하고 그동안 for문은 계속해서 작동한다
    for (int j=0; j<star[i].length; j++) {//
int a = j;
int b = star.length-1-i;
result[a][b] = star[i][j];			
    }
}

for (int i=0; i<result.length; i++) {
    for (int j=0; j<result[i].length; j++) {
        System.out.print(result[i][j]);
            }
        System.out.println();//출력
        }
    }  
}
