import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        List<Integer> PossibleNumbers= new ArrayList<>();
        Random random=new Random();
        for(int i=0; i<11;i++){
            PossibleNumbers.add(i);
        }
        Collections.shuffle(possibleNumbers, new Random());

        // Se size è maggiore di 11, limita la lista a 11 elementi
        return possibleNumbers.subList(0, Math.min(size, 11));
    }
        

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public class RandomNumbers {
        public static List<Integer> getRandomUniqueInteger(int size, int max) {
            if (size > max + 1) {
                size = max + 1; // Limitiamo la dimensione a max + 1, perché non possiamo avere più di (max + 1) numeri unici tra 0 e max
            }
    
            List<Integer> possibleNumbers = new ArrayList<>();
            for (int i = 0; i <= max; i++) {
                possibleNumbers.add(i);
            }
            
            Collections.shuffle(possibleNumbers, new Random());
    
            return possibleNumbers.subList(0, size);
        }
    }
    
    // }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
    public static List<Integer> getRandomUniqueInteger(int size, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min should not be greater than max");
        }
        
        int range = max - min + 1;
        if (size > range) {
            size = range; // Limitiamo la dimensione al numero massimo di valori unici disponibili
        }

        List<Integer> possibleNumbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            possibleNumbers.add(i);
        }
        
        Collections.shuffle(possibleNumbers, new Random());

        return possibleNumbers.subList(0, size);
    }
    

    // restituisce una mappa di frequenza di numeri interi
     public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
    }
}
