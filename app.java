public class app {
    public class DataHelper {

        public static List<Integer> getRandomInteger(int size) {
            // Implementazione semplice: ritorna una lista di numeri casuali tra 0 e 10
            return RandomNumbers.getRandomInteger(size, 10);
        }
    
        public static List<Integer> getRandomInteger(int size, int max) {
            // Implementazione: ritorna una lista di numeri casuali tra 0 e max
            return RandomNumbers.getRandomInteger(size, 0, max);
        }
    
        public static List<Integer> getRandomInteger(int size, int min, int max) {
            // Implementazione: ritorna una lista di numeri casuali tra min e max
            return RandomNumbers.getRandomUniqueInteger(size, min, max);
        }
    
        public static List<Integer> getRandomUniqueInteger(int size, int max) {
            // Implementazione: ritorna una lista di numeri casuali unici tra 0 e max
            return RandomNumbers.getRandomUniqueInteger(size, 0, max);
        }
    
        public static List<Integer> getRandomUniqueInteger(int size, int min, int max) {
            // Implementazione: ritorna una lista di numeri casuali unici tra min e max
            return RandomNumbers.getRandomUniqueInteger(size, min, max);
        }
    
        public static Map<Integer, Integer> getFrequencyMap(List<Integer> numbers) {
            // Implementazione del metodo per ottenere la mappa di frequenza
            return FrequencyCounter.getFrequencyMap(numbers);
        }
    
        public static void testRandomInteger() {
            // Testare le 3 implementazioni del metodo getRandomInteger
            System.out.println("Testing getRandomInteger with size only:");
            System.out.println(getRandomInteger(10));
    
            System.out.println("Testing getRandomInteger with size and max:");
            System.out.println(getRandomInteger(10, 20));
    
            System.out.println("Testing getRandomInteger with size, min, and max:");
            System.out.println(getRandomInteger(10, 5, 15));
        }
    
        public static void testRandomUniqueInteger() {
            // Testare le 3 implementazioni del metodo getRandomUniqueInteger
            System.out.println("Testing getRandomUniqueInteger with size and max:");
            System.out.println(getRandomUniqueInteger(10, 10));
    
            System.out.println("Testing getRandomUniqueInteger with size, min, and max:");
            System.out.println(getRandomUniqueInteger(10, 5, 15));
        }
    
        public static void testFrequencyMap() {
            // Testare il metodo getFrequencyMap
            List<Integer> randomNumbers = getRandomInteger(10, 5, 15);
            System.out.println("Generated random numbers:");
            System.out.println(randomNumbers);
    
            Map<Integer, Integer> frequencyMap = getFrequencyMap(randomNumbers);
            System.out.println("Frequency map:");
            System.out.println(frequencyMap);
        }
    
        public static void main(String[] args) {
            testRandomInteger();
            testRandomUniqueInteger();
            testFrequencyMap();
        }
    }
}
