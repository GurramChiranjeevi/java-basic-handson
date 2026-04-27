class StringUtils {
  static boolean containsChar(String word, char target) {
    for(int index = 0; index < word.length() ; index++) {
      if(word.charAt(0) == target) return true;
    }
    return false;
  }

}