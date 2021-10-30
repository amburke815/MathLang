package lang.mathobjects;

import lang.latexutils.EqualityType;
import lang.latexutils.LaTeXWriter;

public interface IMathObject {


  IMathObject copy();

  LaTeXWriter toLaTeX();

  LaTeXWriter toLaTeX(String LaTeXIdentifier);

  LaTeXWriter toLaTeX(String LaTeXIdentifier, EqualityType eqType);



  @Override
  String toString();

  @Override
  int hashCode();

  @Override
  boolean equals(Object o);




}
