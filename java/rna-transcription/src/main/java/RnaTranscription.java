public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        String transcribed = "";

        for(char c : dnaStrand.toCharArray()) {
            switch(c) {
                case 'G':
                    transcribed += "C";
                    break;
                case 'C':
                    transcribed += "G";
                    break;
                case 'T':
                    transcribed += "A";
                    break;
                case 'A':
                    transcribed += "U";
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Invalid input");
            }
        }
        
        return transcribed;
    }
}