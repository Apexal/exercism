class SumOfMultiples {
    int limit;
    int[] set;

    SumOfMultiples(int number, int[] set) {
        limit = number;
        this.set = set;
    }

    int getSum() {
        int sum = 0;
        for(int n : set) {
            // Get multiples
            int i = 1;
            while(true) {
                int multiple = n * i;
                if(multiple >= limit) break;
                sum += multiple;
                i++;
            }
        }

        return sum;
    }

}
