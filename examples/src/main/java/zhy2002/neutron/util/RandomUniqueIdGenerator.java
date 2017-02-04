package zhy2002.neutron.util;


import zhy2002.neutron.UniqueIdGenerator;

import java.util.Random;

public class RandomUniqueIdGenerator implements UniqueIdGenerator {

    //todo This seed is not secure enough. Need to retrieve this from the server side.
    public static final UniqueIdGenerator Instance = new RandomUniqueIdGenerator((int) System.currentTimeMillis());
    private Random random;

    RandomUniqueIdGenerator(int seed) {
        random = new Random(seed);
    }

    public String next() {
        int upperBound = 62 * 62 * 62 * 62;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int rand = random.nextInt(upperBound);
            addToResult(result, rand);
        }

        return result.toString();
    }

    private static void addToResult(StringBuilder result, int rand) {
        for (int i = 0; i < 4; i++) {
            int code = rand % 62;
            rand /= 62;
            addChar(result, code);
        }
    }

    private static void addChar(StringBuilder result, int code) {
        if (code < 10) {
            result.append(code);
        } else if (code < 36) {
            result.append((char) (code - 10 + 'A'));
        } else {
            result.append((char) (code - 36 + 'a'));
        }
    }
}
