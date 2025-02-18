import java.util.Random;

class RandomNumGen {
    private final Random random = new Random();
    public int generateRandomInt(int bound) {
        return random.nextInt(100);
    }
}
