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




   }
}
