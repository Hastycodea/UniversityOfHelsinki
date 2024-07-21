public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd integer.");
        }

        MagicSquare magicSquare = new MagicSquare(size);
        int[][] square = new int[size][size];
        int number = 1;
        int row = 0;
        int col = size / 2;

        while (number <= size * size) {
            square[row][col] = number;
            number++;

            int newRow = (row - 1 + size) % size;
            int newCol = (col + 1) % size;

            if (square[newRow][newCol] != 0) {
                newRow = (row + 1) % size;
                newCol = col;
            }

            row = newRow;
            col = newCol;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                magicSquare.placeValue(j, i, square[i][j]);
            }
        }

        return magicSquare;
    }
}