package lang.mathobjects;

import java.util.List;
import lang.latexutils.LaTeXWriter;

public abstract class FundamentalSet implements IMathObject {

  public abstract java.util.List<Axiom> axioms();

  public abstract Proof proof();

  public abstract LaTeXWriter toLaTeX();

  public abstract <X> boolean contains(X member);

  public abstract List<FundamentalSet> subsets();

}
