public class GridSignalAnalyzer {

    char[][] scrambledGrid = {
        {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
        {'A', 'L', 'P', 'H', 'A'},
        {'T', 'A', 'N', 'G', 'O', '7'},
        {'B', 'R', 'A', 'V', 'O'}
    };

    void analyzeWithForLoop() {
        for (int i = 0; i < scrambledGrid.length; i++) {
            for (int j = 0; j < scrambledGrid[i].length; j++) {
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    void analyzeWithForEachLoop() {
        for (char[] row : scrambledGrid) {
            System.out.println("Processing Row with Hash: " + row);
            for (char cell : row) {
                System.out.println(" -> " + cell);
            }
        }
    }

    void analyzeWithHybridLoop() {
        for (char[] row : scrambledGrid) { 
            for (int i = 0; i < row.length; i++) { 
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }
}


