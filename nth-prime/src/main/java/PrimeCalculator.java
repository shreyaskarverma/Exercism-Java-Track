class PrimeCalculator {
    private int[] sieveArray = new int[104744];
    private int[] mapForNthPrime = new int[10003];
    void fillArrayMarkingPrimes()
    {
        int countPrimes=0;
        for(int i=2;i<104744;i++)
        {
            if(sieveArray[i]==0)
            {
                countPrimes++;
                mapForNthPrime[countPrimes]=i;
                for(int x=(2*i);x<104744;x=x+i) {
                    sieveArray[x] = 1;
                }
            }
        }
    }
    int nth(int nth) {
        if(nth<=0 || nth> 10002)
            throw new IllegalArgumentException();
        fillArray();
        return mapForNthPrime[nth];
    }

}
