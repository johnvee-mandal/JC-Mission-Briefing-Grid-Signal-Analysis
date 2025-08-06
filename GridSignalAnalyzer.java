public class GridSignalAnalyzer {
   
        char[][] scrambledGrid = {
    {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
    {'A', 'L', 'P', 'H', 'A'},
    {'T', 'A', 'N', 'G', 'O', '7'},
    {'B', 'R', 'A', 'V', 'O'}
};

void analyzeWithForLoop() {
        System.out.println("Analyzing with standard for-loop:");
        for (int i = 0; i < scrambledGrid.length; i++) {
            for (int j = 0; j < scrambledGrid[i].length; j++) {
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }



    }

    void analyzeWithForEachLoop() {
        System.out.println("Analyzing with advanced for-each loop:");
        for (char[] row : scrambledGrid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
void analyzeWithHybridLoop() {
        System.out.println("Analyzing with hybrid loop approach:");
        for (int i = 0; i < scrambledGrid.length; i++) {
            for (char cell : scrambledGrid[i]) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}