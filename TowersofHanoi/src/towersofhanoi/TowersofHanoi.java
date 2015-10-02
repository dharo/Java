/*
 * Towers of Hanoi 
 * Recursive
 * PegA = Source
 * PegB = temp
 * PegC = destination
 */
package towersofhanoi;

/**
 *
 * @author david
 */
public class TowersofHanoi {
    static double count=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start = 1;
        int temp = 2;
        int end = 3;
        int disks = 10;
        
        solveTowers(disks,start,end,temp);
        System.out.println();
        System.out.println("This solved in "+count+" steps.");
    }
    public static void solveTowers(int disks, int pegA, int pegC, int pegB){
        count++;
        if(disks == 1){
            System.out.printf("\n%d --> %d", pegA, pegC);
            return;
        }
        solveTowers(disks-1, pegA, pegB, pegC);
        System.out.printf("\n%d --> %d", pegA, pegC);
        solveTowers(disks-1, pegB, pegC, pegA);
    }
}
