package lang.latexutils;

public enum EqualityType {
  EQUAL("="), // A = B <--> A is mathematically equivalent to B under a defined domain
  COMPUTATIONALLY_EQUIVALENT("=="), // A == B <--> A is computationally equivalent to B
  LOG_EQUIV("\\equiv"), // A ≡ B <--> A is logically or structurally equivalent to B
  STRUCT_EQUIV("\\equiv"), // A ≡ B <--> A is structurally equivalent to B (intensionally, too)
  NUM_CONGRUENCY("\\equiv"), // A ≡ B <--> A is congruent to B (mod n)
  SHAPE_CONGRUENCY("\\cong"), // A
  DEF_TO_BE_EQUAL_LR(":="), // A := B <--> A defined to be equal to B
  DEF_TO_BE_EQUAL_RL("=:"), // A =: B <--> A bestows definition upon B
  DEF_TO_BE_EQUAL_BI(":=:"), // A :=: B <--> A defined in reference to B and B defined in reference to A
  IMPLIES("=>"), // =>
  APPROXIMATELY_EQUAL("\\approx"),
  ISOMORPHIC("\\cong"),
  TILDE("~");

  private EqualityType(String LaTeXSymbol) {
    this.LaTeXSymbol = LaTeXSymbol;
  }

  private final String LaTeXSymbol;

}
