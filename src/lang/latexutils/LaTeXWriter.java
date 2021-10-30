package lang.latexutils;

public class LaTeXWriter {
  private String content;


  public LaTeXWriter(String content) {
    this.content = content;
  }

  LaTeXWriter() {
    this("");
  }

  public void append(String moreText) {
    this.content = content + moreText;
  }

  @Override
  public String toString() {
    return "$" + content + "$";
  }
}
