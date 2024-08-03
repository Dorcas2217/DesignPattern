public class Channel{
  private String name;

  public Channel(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void suscribe(User user){
    user.setName(name);
  }

  public void unsuscribe(User user){
    user.setName("");
  }
}
