class Main {
  public static void main(String[] args) {
    int n0 = 0,n1 = 1,sum,i,count = 10;
  
    for(i = 1; i < count ; i++){
      sum = n0 + n1;
      n0 = n1;
      n1 = sum;
      System.out.print(" " +sum);
         }
  }
}