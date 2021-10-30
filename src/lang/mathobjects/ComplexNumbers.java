package lang.mathobjects;

import java.util.List;
import lang.latexutils.EqualityType;
import lang.latexutils.LaTeXWriter;

public abstract class ComplexNumbers extends FundamentalSet {

  @Override
  public List<Axiom> axioms() {
    return null;
  }

  @Override
  public Proof proof() {
    return null;
  }

  @Override
  public IMathObject copy() {
    return null;
  }

  @Override
  public LaTeXWriter toLaTeX() {
    return null;
  }

  @Override
  public LaTeXWriter toLaTeX(String LaTeXIdentifier) {
    return null;
  }

  @Override
  public LaTeXWriter toLaTeX(String LaTeXIdentifier, EqualityType eqType) {
    return null;
  }

  @Override
  public List<FundamentalSet> subsets() {
    return null;
  }

  
}
