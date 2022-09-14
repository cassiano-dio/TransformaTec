public class GradesMatrix {
    
    public static void main(String[] args)
    {
  
        int[][][] grades = {
                                { 
                                    { 1, 2 }, 
                                    { 3, 4 } 
                                }, 
                                {
                                    { 5, 6 }, 
                                    { 7, 8 } 
                                } 
                            };
  
        for (int i = 0; i < 2; i++)

            for (int j = 0; j < 2; j++)

                for (int z = 0; z < 2; z++)

                    System.out.println("Notas: [" + i
                        + "]["
                        + j + "]["
                        + z + "] = "
                        + grades[i][j][z]);
    }
}