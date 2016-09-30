public class BeerSong {
    public static void Ninety_Nine_Bottles_of_Beer(){
         int bottlesOfBeer = 99;
        for (int i = 1 ; i < 100; i++)// loop to count down 99 bottles of beer song and write to display
            if (bottlesOfBeer > 1) {
                System.out.println(bottlesOfBeer + " bottles of beer on the wall, " + bottlesOfBeer + " bottles of beer");
                bottlesOfBeer = bottlesOfBeer - 1;
                System.out.println("take one down, pass it around," + bottlesOfBeer + " bottles of beer on the wall.");
                // if statement to single out last line of sont at 1 bottle of beer
            } else {
                System.out.println(bottlesOfBeer + " bottles of beer on the wall, " + bottlesOfBeer + " bottles of beer");
                System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            }
    }
    public static void Main(){
        Ninety_Nine_Bottles_of_Beer();
    }
    public static void main(String[] args) {
        Main();
//        System.out.println();//added space to check function
//        Ninety_Nine_Bottles_of_Beer(); // test Ninety_Nine_Bottles_of_Beer()
    }
}