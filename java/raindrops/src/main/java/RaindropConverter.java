class RaindropConverter {

    String convert(int number) {
        String converted = "";

        if (number % 3 == 0) converted += "Pling";
        if (number % 5 == 0) converted += "Plang";
        if (number % 7 == 0) converted += "Plong";
        
        return (converted.isEmpty() ? Integer.toString(number) : converted);
    }

}
