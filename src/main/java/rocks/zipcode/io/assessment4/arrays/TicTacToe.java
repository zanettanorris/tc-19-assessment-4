package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
String [][] board;
boolean isWinner = false;
String winner = "";

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];
        row[0] = board[value][0];
        row[1] = board[value][1];
        row[2] = board[value][2];
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        column[0] = board[0][value];
        column[1] = board[1][value];
        column[2] = board[2][value];
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        for (int i = 0; i < 3; i++) {
        //checking for rows
        checkValues(board[rowIndex][0], board[rowIndex][1], board[rowIndex][2]);
       }
        return (isWinner);
    }
    public Boolean isColumnHomogeneous(Integer columnIndex) {
        for (int i = 0; i < 3; i++) {
            //checking for columns
            checkValues(board[0][columnIndex], board[1][columnIndex], board[2][columnIndex]);
      }
        return isWinner;
    }
    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            //checking for rows
            checkValues(board[i][0], board[i][1], board[i][2]);
            if (isWinner) {
                return winner;
            }
        }
        for (int i = 0; i < 3; i++) {
            //checking for columns
            checkValues(board[0][i], board[1][i], board[2][i]);
            if (isWinner) {
                return winner;
            }
        }

        // checking diagonal
        checkValues(board[0][0], board[1][1], board[2][2]);
        if (isWinner) {
            return winner;
        }

        checkValues(board[0][2], board[1][1], board[2][0]);
        if (isWinner) {
            return winner;
        }

        return "";

    }

    public String[][] getBoard() {
        return null;
    }

    private void checkValues(String charOne, String charTwo, String charThree) {

        if (charOne == charTwo && charTwo == charThree && charOne != " ") {
            if (charOne == "X") {
                isWinner = true;
                winner = "X";
            } else if (charOne == "O") {
                isWinner = true;
                winner = "O";
            } else {
                winner = "";
            }
        }}}