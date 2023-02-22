package itschoolS5;

import java.util.UUID;

public class UserDetails {

     public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.valueOf(UUID.randomUUID()));
        }
     }
    // }example UUID
    String userId = String.valueOf(UUID.randomUUID());
    String firstName;
    String lastName;
    String iBan;
    String email;
    double accountBalance;

    public String getUserId(){
        return userId;
    }
  //  public void setUserId(String userId){
  //      this.userId = userId;
  //  }      Tips we don't need to set this value because we need everytime to get a new uuid and this is allready set
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getIban(){
        return iBan;
    }
    public void setIban(String iBan){
        this.iBan = iBan;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }



}
