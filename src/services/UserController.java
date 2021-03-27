/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import components.DepartmentInterface;
import components.EmployeeInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;
import model.EmployeeModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author ACER
 */
public class UserController extends FileService {

    private static ArrayList<EmployeeModel> employees;
    private static ArrayList<HashMap<String, Object>> departments;
    private long attempts;

    public UserController() {
        employees = new ArrayList<>();
        departments = new ArrayList<>();
        fromJSON();
    }

//    public static void print(Object value) {
//        UserController controller = new UserController();
//        System.out.println("[PRINT]" + controller.safetyNull(value));
//    }
    public void getEmployeeList(EmployeeInterface a) {
        employees.forEach((EmployeeModel model) -> {
            a.getEmployee(model);
        });
    }
//    public void getEmployeeListFilter(String filter , EmployeeInterface a){
//         boolean status = convertStatus(filter);
//        employees.forEach((model) -> {
//             if (model.isLocked() == status) {
//                 
//             }
//        });
//    }

    public void getDepartmentsList(DepartmentInterface a) {
//        System.out.println(departments);
        departments.forEach((department) -> {
//            a.setDepartments(department);
            a.setDepartments(department);
        });
    }

    public void addDepartments(HashMap<String, Object> dep) {
        departments.add(dep);
        toJSON(employees, departments);
    }

    public void deleteDepartments(HashMap<String, Object> dep) {
        departments.remove(dep);
        toJSON(employees, departments);
    }

//    public void getEmployee(String usernameString, EmployeeInterface a) {
//        for (EmployeeModel model : employees) {
//            if (usernameString.equals(model.getUsername())) {
//                a.getEmployee(model);
//            }
//        }
//    }
    private void fromJSON() {

        if (!departments.isEmpty() || !employees.isEmpty()) {
            departments.clear();
            employees.clear();
        }
        checkFile((values) -> {
//            System.out.println("1" + values);
            JSONObject departmentsObject = new JSONObject();
            JSONArray userArray = new JSONArray();
            JSONObject usersObject = new JSONObject();
            for (int i = 0; i < values.size(); i++) {
                JSONObject object = (JSONObject) values.get(i);
                if (object.containsKey("department")) {
                    departmentsObject = (JSONObject) values.get(i);
                    departments = (ArrayList<HashMap<String, Object>>) departmentsObject.get("department");
                } else if (object.containsKey("users")) {
                    usersObject = (JSONObject) values.get(i);;
                    userArray = (JSONArray) usersObject.get("users");
                }
            }
//            System.out.println("Size:" + userArray.size());
            for (int i = 0; i < userArray.size(); i++) {
                JSONObject userMap = (JSONObject) userArray.get(i);
                String username = userMap.get("username").toString();
                String password = checkNull(userMap.get("password")).toString();

                String first_name = checkNull(userMap.get("fName")).toString();
                String last_name = checkNull(userMap.get("lName")).toString();
                String gender = checkNull(userMap.get("gender")).toString();
                String department = checkNull(userMap.get("department")).toString();
                long counter = getCounter(userMap.get("counter"));

                boolean status = convertStatus(checkNull(userMap.get("status")).toString());
//                System.out.println(getStatus(status));
                employees.add(new EmployeeModel(username, password, first_name, last_name, gender, department, counter, status));

            }

        });
    }

    public void addEmployee(EmployeeModel m) {

        employees.add(m);
        toJSON(employees, departments);

    }

    public void updateEmployee(EmployeeModel model) {
        employees.forEach((t) -> {
            if (model.getUsername().equals(t.getUsername())) {
                t.setLocked(model.isLocked());

            }
        });
        toJSON(employees, departments);
    }

    public void deleteEmployee(EmployeeModel model) {

        employees.remove(model);

        toJSON(employees, departments);
    }

    public long setIncreaseCounter(EmployeeModel employee) {

        getEmployeeList(((model) -> {
            if (employee.getUsername().equals(model.getUsername())) {
                if (model.getCounter() != 3) {
                    attempts = model.getCounter() + 1;
                    model.setCounter(attempts);
                    updateEmployee(model);
                }
            }
        }));

        return attempts;
    }

    public void setCounterDefault(EmployeeModel employee) {
        getEmployeeList(((model) -> {
            if (employee.getUsername().equals(model.getUsername())) {
                model.setCounter(0);
            }
        }));
    }

    private long getCounter(Object v) {
        long value = 0;
        if (v != null) {
            value = (long) v;
        }

        return value;
    }

    private Object checkNull(Object v) {
        return v == null ? "null" : v;
    }

    public boolean convertStatus(String status) {
        return status.equals("locked");
    }

    public String getStatus(boolean status) {
        return status ? "locked" : "unlocked";
    }

}
