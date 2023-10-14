class ResistorColor {
    int colorCode(String color) {
        int colorValue=0;
        String[] colorsList=colors();
        for(int i=0;i<colorsList.length;i++)
        {
            if(color.equals(colorsList[i])){
                colorValue=i;
                break;
            }
        }
        return colorValue;
    }

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
