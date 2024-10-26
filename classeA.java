package Projeto_Kaue_Oliveira;

class classeA {
  private int A1;
  private float A2;
  

  public void setA1(int A1){
    this.A1 = A1;
  }

  public void setA2(float A2){
    this.A2 = A2;
  }

  public int getA1(){
    return A1;
  }
  public float getA2(){
    return A2;
  }

  public void MA1(){
    System.out.println("O nome do metodo é MA1");
  }


  public void MA2(){
    System.out.println("O nome do metodo é MA2");
  }

  public void MA3() {
    System.out.println("Alteraçao a classeA a partir do clone");
}

  public int getSoma(int a, int b){
    return a+b;
  }
}