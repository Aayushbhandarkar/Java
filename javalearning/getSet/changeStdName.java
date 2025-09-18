package getSet;

public class changeStdName {

  private String name ;

  public void setName(String newName){
    name = newName;
  }

  public String getName(){
    return name ;
  }

  public static void main(String[] args) {
    changeStdName s1 = new changeStdName();
    s1.setName("Ayush");
    System.out.println(s1.getName());
  }

}
