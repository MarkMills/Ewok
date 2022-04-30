import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) throws IOException {
    //create 2d array
    int[][] square = new int[4][4];
    //read file
    Scanner input = new Scanner(new File("Lab8Data.txt"));
    //while loop for each array
    while (true) {
      //blank values for array
      int r, c;
      //column 1 and the sum everything should equal
      int sum = 0;
      //row sum
      int row1 = 0;
      int row2 = 0;
      int row3 = 0;
      int row4 = 0;
      //colomn sum
      int column2 = 0;
      int column3 = 0;
      int column4 = 0;
      //diagonal sum
      int diag1 = 0;
      int diag2 = 0;
      //create arrays
      for (r = 0; r < 4; r++) {
        for (c = 0; c < 4; c++) {
          //sentinal value
          if (square[r][c] == -999) {
            break;
          } else {
            square[r][c] = input.nextInt();
          }
        }
      }
      //print arrays
      for (r = 0; r < 4; r++) {
        for (c = 0; c < 4; c++) {
          //sentinal value
          if (square[r][c] == -999) {
            break;
          } else {
            System.out.print(square[r][c] + " ");
          }
        }
        System.out.println();
      }
      //SUM EACH COLuMN
      for (c = 0; c < 4; c++) {
        sum += square[0][c];
      }
      for (c = 0; c < 4; c++) {
        column2 += square[1][c];
      }
      for (c = 0; c < 4; c++) {
        column3 += square[2][c];
      }
      for (c = 0; c < 4; c++) {
        column4 += square[3][c];
      }
      //SUM EACH ROW
      for (r = 0; r < 4; r++) {
        row1 += square[r][0];
      }
      for (r = 0; r < 4; r++) {
        row2 += square[r][1];
      }
      for (r = 0; r < 4; r++) {
        row3 += square[r][2];
      }
      for (r = 0; r < 4; r++) {
        row4 += square[r][3];
      }
      //SUM DIAGONALS
      diag1 += (square[0][0] + square[1][1] + square[2][2] + square[3][3]); 
      diag2 += (square[0][3] + square[1][2] + square[2][1] + square[3][0]);
      
      //DETERMINE IF EACH ROW< COLUMN< AND DIAGONAL IS EQUAL TO THE FIRST COLUMN
      if (row1 == sum && row2 == sum && row3 == sum && row4 == sum && column2 == sum && column3 == sum && column4 == sum && diag1 == sum && diag2 == sum) {
        System.out.println("IS a magic square\n");
      } else {
        System.out.println("NOT a magic square\n");
      }
    }
  }
}
