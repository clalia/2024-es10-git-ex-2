import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataHelper {

    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {
        List<Integer> randomNumbers= new ArrayList<>();
        Random random=new Random();
        for(int i=0; i<size; i++){
            int randomNumber=random.nextInt(11);
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {
        List<Integer> randomNumbers= new ArrayList<>();
        Random random=new Random();
        for(int i=0; i<size;i++){
            int randomNumber=random.nextInt(max+1);
            randomNumbers.add(randomNumber);
        }

        return randomNumbers;
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {
        List<Integer> randomNumbers= new ArrayList<>();
        Random random=new Random();
        for(int i=0; i<size;i++){
            int randomNumber= random.nextInt((max-min)+1)+min;
            randomNumbers.add(randomNumber);
        }

        return randomNumbers;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    public static List<Integer> getRandomUniqueInteger(int size) {
        if(size>11){

    // return null;
    // }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    // public static ??? getRandomUniqueInteger(int size, int max) {
    //
    // return null;
    // }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
    // public static ??? getRandomUniqueInteger(int size, int min, int max) {
    //
    // return null;
    // }

    // restituisce una mappa di frequenza di numeri interi
    // public static ??? getFrequencyMap(List<Integer> list) {
    //
    // return null;
    // }

}
