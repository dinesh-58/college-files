// program from 1st class
namespace Arrays;
public class MultiDim {
    public static void CreateArray() {
        int [,,] arr = new int[2,2,3]{
            { {0,1,2}, {3,4,5} },
            { {6,7,8}, {9,10,11} }
        };
        // Console.Write("length is: {0}", arr.Length);
        for(int i=0; i<arr.GetLength(0); i++) {
            for(int j=0; j<arr.GetLength(1); j++) {
                for(int k=0; k<arr.GetLength(2); k++) {
                    Console.Write(arr[i,j,k] + " ");
                }
                Console.Write("\t");
            }
            Console.WriteLine();
        }
    }
}
