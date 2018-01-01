import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    int number;

    public NaturalNumber(int n) {
        if(n < 1) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        number = n;
    }

    public int getAliquotSum() {
        if(number == 1) return 0;

        List<Integer> factors = new ArrayList<Integer>();
        factors.add(1);

        for(int i = 2; i < number; i++) {
            if(number % i == 0) factors.add(i);
        }

        return factors.stream().mapToInt(value -> value).sum();
    }

    public Classification getClassification() {
        int sum = getAliquotSum();

        if(sum == number) return Classification.PERFECT;
        if(sum > number) return Classification.ABUNDANT;

        return Classification.DEFICIENT;
    }
}
