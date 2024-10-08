// Question: Complete the function to count the number of islands in a 2D grid (using DFS).

class Main {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands += dfs(grid, i, j);
                }
            }
        }
        return numIslands;
    }

    private static int dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return 0;
        grid[i][j] = '0';  // Mark visited
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        return 1;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Number of islands: " + numIslands(grid));
    }
}
