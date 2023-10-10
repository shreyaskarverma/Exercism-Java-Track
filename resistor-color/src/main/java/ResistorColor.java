class ResistorColor {
    String[] arr = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int val=0;
        for(int i=0;i<10;i++)
        {
            if(color.equals(arr[i])){
                val=i;
                break;
            }
        }
        return val;
    }

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return arr;
    }
}
