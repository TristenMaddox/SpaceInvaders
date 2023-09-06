public class App {
    public static void main(String[] args) {

        for(int row = 0; row <= 8; row++) {
       for(int col = 0; col < 8; col++){
           //get the piece color
           String color = getPieceColor(row, col);
           //get the piece
           String piece = getPiece(row, col);
           //Print color, piece, and space
                }
          }
        }

    private static String getPiece(int row, int col) {
        if (row >= 2 && row <= 5) {
            return "-";
        } else if (row == 1 || row == 6) {
            return "p";
        } else if (row == 0 || row == 7) {
            return "R";
        } else if (row == 0 || row == 7) {
            return "Q";
        } else if (row == 0 || row == 7) {
            return "N";
        } else if (row == 0 || row == 7) {
            return "B";
        }
        return "K";
    }

    private static String getPieceColor(int row, int col) {
        if(row < 2){
            return "W";
        }
        else if(row > 5) {
            return "B;";

        }
        else{
            return "-";
        }
    }
}
