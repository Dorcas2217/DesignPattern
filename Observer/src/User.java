import java.util.ArrayList;
import java.util.List;

public class User {
  private String name;

  private List<Channel> channels = new ArrayList<Channel>();
  public User(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public void actualiser(){

  }

}
