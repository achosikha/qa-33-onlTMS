package lesson_5_multidimensional_array;

public class MyMultiArray {
    public static void main(String[] args) {
        // Многомерный массив - это просто массив в массиве, поэтому надо значить как работает просто массив
    }

    public static void createTwoDimensionalArray(){
        // Одномерный массив - это цепочка, или же просто РЯД
        // Двумерный массив - это МАТРИЦА, ТАБЛИЦА, или же РЯД и СИДЕНИЕ
        int[][] table; // МАССИВ В МАССИВЕ
        table = new int[3][]; // ПЕРВУЮ СКОБУ после типа НАДО ВСЕГДА ЗАДАВАТЬ, в нашем случае это количество РЯДОВ
        table = new int[][]{new int[5]};

        int[][] tableInitialize = new int[][]{
                {1, 2, 3}, // РЯД, а внутри число СТОЛБКОВ со значениями
                {4, 5, 6},
                {7, 8, 9}
        };

        readTwoDimensionalArrayClassical(tableInitialize);
        System.out.println("-".repeat(50));
        readTwoDimensionalArrayEnhancedFor(tableInitialize);
    }

    public static void createThreeDimensionalArray(){
        // Трехмерный массив - это КУБ
        int[][][] cube = new int[][][]{
                {
                        {1, 0, 8, 1},
                        {9, 1},
                        {1},
                        {0, 0}
                },
                {
                        {0, 0},
                        {-1, -2, 3},
                        {-1, 5, 6, 9, 10}
                },
                {
                        {1}
                }
        };

        for (int outer = 0; outer < cube.length; outer++){
            for (int inner = 0; inner < cube[outer].length; inner++){
                for (int element = 0; element < cube[outer][inner].length; element++){
                    System.out.println("cube[" + outer + "][" + inner + "][" + element + "]: " +
                                                                                    cube[outer][inner][element]);
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("-".repeat(50));

        for (int[][] outer : cube){
            for (int[] inner : outer){
                for (int element : inner){
                    System.out.print(element + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void createQuadroArray(){
        int[][][][] fourDimensionalArray = new int[4][][][];
    }

    public static void readTwoDimensionalArrayClassical(int[][] table){
        for (int rows = 0; rows < table.length; rows++){
            for (int cols = 0; cols < table[rows].length; cols++){
                System.out.print(table[rows][cols] + "\t");
            }
            System.out.println();
        }
    }

    public static void readTwoDimensionalArrayEnhancedFor(int[][] table){
        // Двумерный массив - это массив в массиве
        // table[][] - создать одномерный массив rows[]
        // rows[] - достать коллекцию значений и сохранить в cols
        for (int[] rows : table){
            for (int cols : rows){
                System.out.print(cols + "\t");
            }
            System.out.println();
        }
    }
}