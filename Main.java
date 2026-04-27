class Main {
  public static void main() {
    System.out.printf("%b %b %n",StringUtils.containsChar("hello", 'h'), true); // true
    // System.out.println(StringUtils.reverse("Hello")); // "olleH"
    // System.out.println(StringUtils.replaceAll("Hello"), 'l', 'L'); // "HeLLo"

    Money twelveRupee = new Money(12);
    Money tenRupee = new Money(10);
    
    Money twentyTwoRupee = twelveRupee.add(tenRupee);

    Money twoRupee = twelveRupee.minus(tenRupee);

    System.out.printf("%d %d %n",twentyTwoRupee.value, 22); // 22
    System.out.printf("%d %d %n", twoRupee.value, 2); // 2

    // twoRupee.value = 22; // error
  }
}