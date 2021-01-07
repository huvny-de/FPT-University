
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Henry
 */
public class ManagerServerProgram {

    public static void main(String[] args) {
        String serviceName = "rmi://127.0.0.1:1098/EmployeeService";
        String filename = "employees.txt";
        EmployeeServer server = null;
        try {
            server = new EmployeeServer(filename);
            Registry r = LocateRegistry.createRegistry(1098);
            Naming.rebind(serviceName, server);
            System.out.println("Service" + serviceName + "is running.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
