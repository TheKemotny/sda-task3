public class TowerOfHanoi {

    public static void towerOfHanoi(int numberOfDiscs, char fromRod, char toRod, char bufferRod){
        if(numberOfDiscs == 1){
            System.out.println("MOVE DISK " + numberOfDiscs + " FROM ROD " + fromRod + " TO " + toRod);
            return;
        }
        towerOfHanoi(numberOfDiscs - 1, fromRod, bufferRod, toRod);
        System.out.println("MOVE DISK " + numberOfDiscs + " FROM ROD " + fromRod + " TO " + toRod);
        towerOfHanoi(numberOfDiscs - 1, bufferRod, toRod, fromRod);
    }

    public static void main(String[] args)
    {
        int numberOfDisks = 4;
        towerOfHanoi(numberOfDisks, 'A', 'C', 'B');
    }
}
