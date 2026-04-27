class StringUtils {
  static boolean containsChar(String word, char target) {
    for(int index = 0; index < word.length() ; index++) {
      if(word.charAt(0) == target) return true;
    }
    return false;
  }

  static String reverse(String word) {
    String reversedWord = "";
    for(int index = 0; index < word.length(); index++) {
      reversedWord =  word.charAt(index) + reversedWord;
    }

    return reversedWord;
  }

  static String replaceAll(String word, char replaceWith, char replaceTo) {
    String replacedWord = "";
    for(int index = 0; index < word.length(); index++) {

      replacedWord += (word.charAt(index) == replaceWith) ? 
                        replaceTo :
                        word.charAt(index);
    }

    return replacedWord;

  }

}