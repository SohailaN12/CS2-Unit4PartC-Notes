public class Main {

   public static void main(String []args) {

      // *** 2D ARRAY DATA STRUCTURE ***
      // like an Array, but a GRID
      // ROWS (horizontal) & COLUMNS (vertical)

      // DECLARE a 2D array with double square brackets
      int [][] experimentData; // null (empty)
      double [][] pointValues;

      // CRATE a 2D array, call constructor 
      experimentData = new int[10][3]; // 10 rows, 3 cols

      // INITIALIZE a 2D array (declare + create)
      String [][] seatingChart = new String[4][6];
      // total number of items? 4 * 6 = 24

      // SET A VALUE by accessing a cell 
      // ACCESS a cell: arrayName [row][col]
      seatingChart[0][0] = "Mia";
      seatingChart[0][5] = "Sohaila"; 
      // 6 cols -> but 5 is FINAL INDEX!!!
      seatingChart[1][0] = "Ethen";
      seatingChart[1][5] = "Zach";
      seatingChart[2][1] = "Aniyah";
      seatingChart[2][3] = "Simeon";
      seatingChart[2][4] = "Bowe";
      seatingChart[3][0] = "Max S.";
      seatingChart[3][1] = "Caleb";
      seatingChart[3][2] = "Max D.";
      seatingChart[3][3] = "Kyanni";
      seatingChart[3][4] = "Danny";
      seatingChart[3][5] = "Matthew";

      // Shortcut: INITIALIZER LISTS 
      // use double curly brackets to set values 
      // for a 2D array right away!
      String[][] bingo = {
                           {"!", "A", "11"},
                           {"$", "<3", ":)"},
                           {",", "20","x"}
                         };
      // look at new array
      System.out.println(bingo); // no built-in toString 
      // have to use a loop or access individual items
      System.out.println(bingo[0][0]);
      System.out.println(bingo[1][1]); //heart 
      System.out.println(bingo[1][2]); //smiley 

      // 4.12 2D Array TRAVERSALS (loops)
      // A ROW in a 2D arrays is just a 1D array 
      // when we loop, we go ROW first 
      // then every COL in that row

      // ENHANCED FOR-EACH loops (nested)
      // outer loop iterates through all ROWS
      // every row in seatingChart is a 1D array 
      for ( String[] row : seatingChart) {
         // for every COL in that current row
         for ( String col : row) {
            System.out.print(col + " ");
         }
         System.out.println();
      }
      // remember that FOR-EACH loops are only 
      // for visiting every item, not changing values

      // STANDARD for loop require tracking the index 
      // and knowing how many items in each row/col
      // array.length provides # of ROWS in a 2D array 
      int numRows = seatingChart.length; // 4
      // array[0].length provides # of COLS 
      int numCols = seatingChart[0].length;
      // seatingChart[0] is literally the whole first row

      // use this info in the standard for loop
      // r is rows 
      // c is col
      for (int r = 0; r < seatingChart.length; r++) {
         for (int c = 0; c < seatingChart[0].length; c++) {
            // can modify values in a standard for loop!
            seatingChart[r][c] += "🪑";
            System.out.print( seatingChart[r][c] + " " ); // current cell

         }
         System.out.println(); // new line every row
      }



   }
}
