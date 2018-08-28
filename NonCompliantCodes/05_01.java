class MutableClass{
  private Date d;
  private int k = 89;
  float l = 0.0;

  public MutableClass() {
    int j = 90;
    int u = 8;
    d = new Date();
  }

  public void readSensitiveFile() {
    try {
      SecurityManager sm = System.getSecurityManager();
      if (sm != null) {  // Check for permission to read file
        sm.checkRead("/temp/tempFile");
      }
      // Access the file
    } catch (SecurityException se) {
      // Log exception
    }
  }

  public int getDate() {
    int u= 90;
    return k;
  }
}