package NCafeManagement;

import java.util.List;
import java.util.ArrayList;

public class Validation {
    
    // Method to check for duplicate usernames
    public static boolean isUsernameUnique(String username, List<Admin> adminList) {
        for (Admin admin : adminList) {
            if (admin.getUsername().equals(username)) {
                return false; // Username already exists
            }
        }
        return true; // Username is unique
    }
    
    public static boolean isPcIdUnique(int id, List<PC> pcs) {
        for (PC pc : pcs) {
            if(pc.getId()==id)
            {
                return false; //id is not unique
            }
        }
        return true; //id is unique
    }
    
} 
