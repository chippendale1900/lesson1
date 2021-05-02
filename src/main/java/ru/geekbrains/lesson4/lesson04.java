package ru.geekbrains.lesson4;

public class lesson04 {

    public static char [][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human = 'X';
    public static char ai = '0';
    public static char empty_field = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void creatMap(int sizeX, int sizeY) {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char [mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX ; x++) {
                map[y][x] = empty_field;
            }
        }
    }

    public static void showMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x=0; x < mapSizeX; x++) {
                System.out.println(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("---------");
    }


    public static void humanTurn () {
        int x;
        int y;

        do {
            System.out.println("Enter your turn coordinates:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while ( isValidCell(x, y) || isEmptyCell(x, y));
            map[y][x] = human;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeYp);
        } while (!isValidCell(x, y));
        System.out.println("Ai turn is [" + (y + 1) + ":" + (x + 1) + "]");
        map[y][x] = ai;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == empty_field;
    }
    public static boolean isDraw() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty_field) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char player) {

        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;

        return false;
    }

    public static void main(String[] args) {
            creatMap();
            showMap();

            while (true) {
                humanTurn();
                showMap();

                if (checkWin(human)) {
                    System.out.println("Human win!!!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Is Draw!!!");
                    break;
                }

                aiTurn();
                showMap();

                if (checkWin(ai)) {
                    System.out.println("Ai win!!!");
                    break;
                }
                if (isDraw()) {
                    System.out.println("Is Draw!!!");
                    break;
                }
            }
            System.out.println("Game over!");
    }
}
