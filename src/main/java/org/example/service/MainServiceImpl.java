package org.example.service;

import org.example.scaner.Scaner;

public class MainServiceImpl implements MainService {
    public static UserServiceImpl userService = new UserServiceImpl();
    public static EmployeeService adminService = new EmployeeService();

    @Override
    public void kirish() {
        int select;
        while (true) {
            System.out.println("1.Employeee\n2.User\n0.Orqaga");
            try {
                select = Scaner.getInt();
                if (select == 0) {
                    System.out.println("Bay bay");
                    return;
                }
                if (select == 1) {
                    adminService.kirish();
                }
                if (select == 2) {
                    userService.entred();
                } else {
                    System.out.println("Qayta urinib kuring");
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }

        }
    }
}
