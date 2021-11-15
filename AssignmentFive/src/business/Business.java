/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author deepv
 */
public class Business extends Organization {

    private static Business business;
    private String name1;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Business(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public static Business getBusiness() {
        return business;
    }

    public static void setBusiness(Business business) {
        Business.business = business;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
    
    
}
