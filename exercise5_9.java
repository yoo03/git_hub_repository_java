class exercise5_9{
    public static void main(String[] args) {
        char[][] star = {
            {'*', '*', ' ', ' ', ' '},
            {'*', '*', ' ', ' ', ' '},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'}
    };/*다차원 배열 star에 대한 선언과 
    {'*', '*', ' ', ' ', ' '},
    {'*', '*', ' ', ' ', ' '},
    {'*', '*', '*', '*', '*'},
    {'*', '*', '*', '*', '*'} 으로 초기화*/

    char[][] result = new char[star[0].length][star.length];// 2차원 배열에 대한 선언과 초기화

    for (int i=0; i<star.length; i++) {//i는 0부터 시작해서 star배열의 길이까지 증가하고 그동안 for문은 계속해서 작동한다
        for (int j=0; j<star[i].length; j++) {//j는 0부터 시작해서 star배열의 길이까지 증가하고 그동안 for문은 계속해서 작동한다
            System.out.print(star[i][j]);//star[i][j]의 값을 받아서 출력시킨다
    }
    System.out.println();//출력
}

System.out.println();//출력

for (int i=0; i<star.length; i++) {//i는 0부터 시작해서 star배열의 길이까지 증가하고 그동안 for문은 계속해서 작동한다
    for (int j=0; j<star[i].length; j++) {// j는 0부터 star배열의 길이까지 증가하고 그동안 for문은 계속해서 작동한다
int a = j;// j의 값을 a에 대입
int b = star.length-1-i;// 계산된 값을 b에 대입
result[a][b] = star[i][j];// star배열의 값을 result에 대입		
    }
}

for (int i=0; i<result.length; i++) {// i는 0부터 시작해서 result배열의 길이까지 증가하고 그동안 for문은 계속해서 돈다
    for (int j=0; j<result[i].length; j++) {// j는 0부터 시작해서 result배열의 길이까지 증가하고 그동안 for문은 계속해서 돈다
        System.out.print(result[i][j]);// 배열출력
            }
        System.out.println();//출력
        }
    }  
}// 이코드는 주어진 배열을 시계방향으로 돌리는 코드이다
