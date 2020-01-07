package practicalproblem;

 import java.util.Random;
 
public class Problem10 {
  public static void main(String[] args) {
    int [][]array = new int[4][4];
    Random rand = new Random();
    for(int i=0; i<array.length; i++) {
      for(int j=0; j<array[i].length; j++) {
        array[i][j] = rand.nextInt(9)+1;
      }
    }
    int []index = new int[6];
    for(int i=0; i<6; i++) {
      index[i] = (int)(Math.random()*16+1);
      System.out.print("index["+i+"] = "+index[i]);
      if(i>0)
      {
    	for(int j=0; j<i; j++) {
    	  if(index[j] == index[i]) 
    		{--i;
    		break;}
    	  continue;
        }
      }
      int col = index[i]/4;
      if(col == 4) col = 3;
      System.out.print(" col: "+col);
      int row = index[i]%4-1;
      if(row==-1) row = 3;
      System.out.println(" row: "+row);
      array[col][row] = 0;
    }
    for(int i=0;i<array.length;i++) {
      for(int j=0;j<array[i].length;j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
