package lang.mathobjects;

import java.util.ArrayList;
import lang.latexutils.EqualityType;
import lang.latexutils.LaTeXWriter;

public class List<X extends IMathObject> implements IMathObject {

  private final java.util.List<X> members;

  List(java.util.List<X> members) {
    this.members = members;
  }

  List(X... members) {
    java.util.List<X> _members = new ArrayList<>();
    for(X x : members) {
      _members.add(x);
    }
    this.members = _members;
  }

  List(X singletonMember) {
    java.util.List<X> members = new ArrayList<>();
    members.add(singletonMember);
    this.members = members;
  }

  List(X member, int numCopies) {
    java.util.List<X> members = new ArrayList<>();
    for (int i = 0; i < numCopies; i++) {
      members.add(member);
    }
    this.members = members;
  }



  @Override
  public IMathObject copy() {
    return new List<>(this.members);
  }

  @Override
  public LaTeXWriter toLaTeX() {
    StringBuilder result = new StringBuilder("$(");

    for(X x : members.subList(0, members.size() - 2)) {
      result.append(x.toLaTeX() + ", ");
    }
    result.append(members.get(members.size() - 1).toLaTeX() + ")$");

    return new LaTeXWriter(result.toString());
  }

  @Override
  public LaTeXWriter toLaTeX(String LaTeXIdentifier) {
    return toLaTeX(LaTeXIdentifier, EqualityType.EQUAL);
  }

  @Override
  public LaTeXWriter toLaTeX(String LaTeXIdentifier, EqualityType eqType) {
    return new LaTeXWriter(LaTeXIdentifier + " " + eqType.toString() + " " + toLaTeX());
  }
}
