class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] words = phrase.split(" |-");

        String acronym = "";
        for(String word : words) {
            acronym += word.toUpperCase().charAt(0);
        }

        return acronym;
    }

}
