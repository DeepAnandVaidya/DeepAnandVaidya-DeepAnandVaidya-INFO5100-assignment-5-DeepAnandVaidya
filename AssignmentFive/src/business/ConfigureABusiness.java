/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.role.Customer;
import business.role.DeliveryManRole;
import business.role.RestaurantRole;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author deepv
 */
public class ConfigureABusiness {

    public static Business configure() {

        Business system = Business.getInstance();
        ArrayList<UserAccount> userAccList = new ArrayList<>();
        UserAccount testAccount = new UserAccount("sysadmin", "sysadmin", "Deep Vaidya", new SystemAdminRole());
        userAccList.add(testAccount);
//        system.getUserAccountDirectory().getUserAccountList().add(testAccount);

        UserAccount testAccount1 = new UserAccount("customer", "customer", "Deep Vaidya Customer", new Customer());
        userAccList.add(testAccount1);
//        system.getUserAccountDirectory().getUserAccountList().add(testAccount1);

        UserAccount testAccount2 = new UserAccount("restaurant", "restaurant", "Deep Vaidya Restaurant", new RestaurantRole());
        userAccList.add(testAccount2);
//        system.getUserAccountDirectory().getUserAccountList().add(testAccount2);

        UserAccount testAccount3 = new UserAccount("delivery", "delivery", "Deep Vaidya Delivery", new DeliveryManRole());
        userAccList.add(testAccount3);
//        system.getUserAccountDirectory().getUserAccountList().add(testAccount3);
        system.getUserAccountDirectory().setUserAccountList(userAccList);

        return system;
    }
}
