class Static_run
{
  static void call()
  {
    System.out.println("Hello!!,Everyone");
  }
  public static void main(String[] args) {
    System.out.println("main class finished");
  }
  static
  {
    System.out.println("Program Started");
    call();
    System.out.println("Program Finished");
  }

}
