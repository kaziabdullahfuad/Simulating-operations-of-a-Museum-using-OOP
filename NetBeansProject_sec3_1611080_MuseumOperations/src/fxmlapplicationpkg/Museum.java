
package fxmlapplicationpkg;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Museum {
    
    private int numberOfTickets;
    private final float price=25;
   String uniqueID;

    public Museum() {
        this.uniqueID = UUID.randomUUID().toString();
        
    }

    public Museum(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
    
    public float calculateBill(int tickets)
    {
        float BILL= tickets*price;
        
        return BILL;
    }
    public void generateBill(String name,float bill,LocalDate date,String noOfTickets)
    {
        FileWriter fw;
        try {
            fw = new FileWriter("GenerateBill.txt",true);
            String str="";
            
            str+="Name: "+name+", No of Tickets: "+noOfTickets+", Bill "+bill+", Date "+date+", Order ID "+uniqueID+"\n";
            fw.write(str);
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Museum.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
    
    
}
