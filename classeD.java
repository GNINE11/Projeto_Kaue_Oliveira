package Projeto_Kaue_Oliveira;

public class classeD {
  private String D1;
  private int D2;

  public classeD(String D1, int D2) {
      this.D1 = D1;
      this.D2 = D2;
  }

  public String getD1() {
      return D1;
  }

  public void setD1(String D1) {
      this.D1 = D1;
  }

  public int getD2() {
      return D2;
  }

  public void setD2(int D2) {
      this.D2 = D2;
  }

  public void MD1() {
      System.out.println("Método MD1: " + D1);
  }

  public void MD2() {
      System.out.println("Método MD2: " + D2);
  }

  public void MD4() {
      System.out.println("Método MD4: ");
  }
}

