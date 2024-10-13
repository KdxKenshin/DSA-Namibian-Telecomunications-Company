
package NamTeleCompany;
public class Contacts {
    String name;
    String number;
    boolean isFavourite;
    
    Contacts(String name, String number){
          try{
    this.name = name;
    this.number = number;
    this.isFavourite = false;
    }
      catch (Exception e) {
            System.out.println("An error occurred " + " " + e.getMessage());
        }
    }
    
     public void setFavourite(boolean isFavourite) {
        this.isFavourite = isFavourite;
    }

    public boolean isFavourite() {
        return this.isFavourite;
    }
    @Override 
    public String toString(){
    return name + "-" + number + (isFavourite? "(favourite)":"");
    }
}
