class ResistorColor {
    int colorCode(String color) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int val=0;
        String[] colorsList=colors();
        for(int i=0;i<colorsList.length;i++)
        {
            if(color.equals(colorsList[i])){
                val=i;
                break;
            }
        }
        return val;
    }

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
