class ReverseString {
  
    String reverse(String s) {
        if (s.isEmpty()) return s;

        StringBuffer rev = new StringBuffer(s.length());
        for(int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
  
}