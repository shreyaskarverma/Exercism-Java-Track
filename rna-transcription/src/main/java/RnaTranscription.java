class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder transcribedRna= new StringBuilder();
        int dnaStrandLength= dnaStrand.length();
        if(dnaStrand.isEmpty())
            return "";
        for(int i=0;i<dnaStrandLength;i++)
        {
            transcribedRna.append(findComplementOfNucleotide(dnaStrand.charAt(i)));
        }
        return transcribedRna.toString();
    }
    char findComplementOfNucleotide(char dnaNucleotide)
    {
        if(dnaNucleotide== 'G')
            return 'C';
        else if (dnaNucleotide== 'C')
            return 'G';
        else if (dnaNucleotide== 'T')
            return 'A';
        else if (dnaNucleotide== 'A')
            return 'U';
        return ' ';
    }
}
