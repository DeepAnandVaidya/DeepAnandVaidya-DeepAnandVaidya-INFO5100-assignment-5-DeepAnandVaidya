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

/**
 *
 * @author deepv
 */
public class ConfigureABusiness {

    public static Business configure() {

        Employee employee = new Employee();
        employee.setName("Deep Vaidya");

        Business system = Business.getInstance();
        UserAccount testAccount = new UserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        system.getUserAccountDirectory().getUserAccountList().add(testAccount);

        Employee employee1 = new Employee();
        employee.setName("Deep Vaidya Customer");
        UserAccount testAccount1 = new UserAccount("customer", "customer", employee, new Customer());
        system.getUserAccountDirectory().getUserAccountList().add(testAccount1);

        Employee employee2 = new Employee();
        employee.setName("Deep Vaidya Restaurant");
        UserAccount testAccount2 = new UserAccount("restaurant", "restaurant", employee, new RestaurantRole());
        system.getUserAccountDirectory().getUserAccountList().add(testAccount2);

        Employee employee3 = new Employee();
        employee.setName("Deep Vaidya Delivery");
        UserAccount testAccount3 = new UserAccount("delivery", "delivery", employee, new DeliveryManRole());
        system.getUserAccountDirectory().getUserAccountList().add(testAccount3);

        return system;
    }
}
