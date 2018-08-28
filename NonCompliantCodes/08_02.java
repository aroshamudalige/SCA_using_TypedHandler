final class Flag {
  private boolean flag;
 
  public synchronized void toggle(int y) {  // Unsafe
    //int c = 0;
    flag = !flag;
  }
 
  public boolean getFlag() { // Unsafe
    return flag;
  }
}