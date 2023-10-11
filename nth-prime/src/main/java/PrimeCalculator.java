class PrimeCalculator {
    private int[] arr = new int[104744];
    private int[] map= new int[10003];
    void fillArray()
    {
        int count=0;
        for(int i=2;i<104744;i++)
        {
            if(arr[i]==0)
            {
                count++;
                map[count]=i;
                for(int x=(2*i);x<104744;x=x+i) {
                    arr[x] = 1;
                }
            }
        }
    }
    int nth(int nth) {
        if(nth<=0 || nth> 10002)
            throw new IllegalArgumentException();
        fillArray();
        return map[nth];
    }

}
