
package users;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class User {
    
    //protected int userId;
    protected String userId;
    protected String password;

    public User() {
        
    }

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public static User login(String id,String pass)
     {
         //Read the files.
         //
        
         File file = new File("User.txt");
        Scanner sc; 
        try {
            sc = new Scanner(file);
            
            while(sc.hasNextLine()){
                
               String str=sc.nextLine();
               String[] temp=str.split(",");
                if(temp[1].equals(id) && temp[2].equals(pass))
                {
                    if(temp[3].equals("Member"))
                    {
                        MuseumMember amd=new MuseumMember(temp[0],temp[1],temp[2]);
                        return amd;
                    }
                    else if(temp[3].equals("Registrar"))
                    {
                        Registrar reg=new Registrar(temp[0],temp[1],temp[2]);
                        return reg;
                    }
                    else if(temp[3].equals("Director"))
                    {
                        Director dir=new Director(temp[0],temp[1],temp[2]);
                        return dir;
                    }
                    else if(temp[3].equals("Curator"))
                    {
                        Curator cur=new Curator(temp[0],temp[1],temp[2]);
                        return cur;
                    }
                    
                }
            }
        } catch (FileNotFoundException ex) {
            
        }   
      return null;   
     }
}
