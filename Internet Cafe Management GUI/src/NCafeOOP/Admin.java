package NCafeManagement;
 abstract class Admin {
    private String username;
    private String password;
    
    public Admin(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    String getUsername(){
        return username;
    }
    
    void setUsername(String username){
        this.username = username;
    }
    
    String getPassword(){
        return password;
    }
    
    void setPassword(String password){
        this.password = password;
    }
}
