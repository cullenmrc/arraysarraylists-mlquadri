// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    private char[][] grid;
    final char SPACE=' ';
    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int rows, int cols)
    {
        this.grid = new char[rows][cols];
        for (int i = 0; i < grid.length; i++)
        {
            for (int x = 0; x < grid[i].length; x++)
            {
                grid[i][x]=SPACE;
            }
        }
    }

    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill  character
    public CharMatrix(int rows, int cols, char fill)
    {
        this.grid = new char[rows][cols];
        for (int i = 0; i < grid.length; i++)
        {
            for (int x = 0; x < grid[i].length; x++)
            {
                grid[i][x]=fill;
            }
        }
    }

    // Returns the number of rows in grid
    public int numRows()
    {
        return grid.length;
    }

    // Returns the number of columns in grid
    public int numCols()
    {
        return grid[0].length;
    }

    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        return grid[row][col];
    }

    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        grid[row][col] = ch;
    }

    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        if ( (grid[row][col]==SPACE ))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Fills the given rectangle with fill  characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int rstart, int cstart, int rfin, int cfin, char fill)
    {
        for (int i = rstart; i <= rfin; i++)
        {
            for (int x = cstart; x <= cfin; x++)
            {
                grid[i][x]=fill;
            }
        }
    }

    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int rstart, int cstart, int rfin, int cfin)
    {
        for (int i = rstart; i <= rfin; i++)
        {
            for (int x = cstart; x <= cfin; x++)
            {
                grid[i][x]=SPACE;
            }
        }
    }

    // Returns the count of all non-space characters in row 
    public int countInRow(int row)
    {
        int count = 0;
        for(int i=0; i< (grid[row].length);i++)
        {
            if (grid[row][i]!= SPACE)
            {
                count+=1;
            }
        }
        return count;
    }

    // Returns the count of all non-space characters in col 
    public int countInCol(int col)
    {
        int count = 0;
        for(int i=0; i< (grid.length);i++)
        {
            if (grid[i][col]!= SPACE)
            {
                count+=1;
            }
        }
        return count;
    }
}
