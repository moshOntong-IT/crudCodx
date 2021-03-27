/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import codxapp.CODXApp;
import components.JSONInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EmployeeModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ACER
 */
public class FileService {

    public void checkFile(JSONInterface v) {

        System.out.println("[INFO]: Checking JSON file");
        try {
            String jarFolder = new File(CODXApp.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile().getPath().replace('\\', '/');
//            Idea for get file inside of jar
//            InputStream in = FileService.class.getClassLoader().getResourceAsStream("assets/codx.json");

            JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader(new File(jarFolder + "/res/codx.json")));

            if (!object.toString().equals("")) {

                JSONArray datas = (JSONArray) object;
//                System.out.println("Datas:" + object);
                v.getObject(datas);
                System.out.println("[SUCCESS]: JSON file is ready to use");

            } else {
                System.out.println("[ERROR]: JSON is not valid");
            }
//            in.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage() + " at "
                    + ex.getStackTrace()[0].getFileName() + " line "
                    + ex.getStackTrace()[0].getLineNumber());
        } catch (NullPointerException e) {
            Logger.getLogger(FileService.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("[ERROR]Fetching file is error");
        } catch (ParseException ex) {
            Logger.getLogger(FileService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(FileService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean copyFile(InputStream source, String destination) {
        boolean succeess = true;

        System.out.println("[INFO]: Copying ->" + source + "\n\tto ->" + destination);
        File res = new File(destination + "/res");
        File json = new File(destination + "/res/codx.json");
        if (!res.exists()) {
            res.mkdir();
        }

        if (!json.exists()) {
            try {
                Files.copy(source, Paths.get(destination + "/res/codx.json"), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                System.out.println("[ERROR]:" + ex);
                succeess = false;
            }
        } else {
             
            succeess = false;
        }

        return succeess;

    }

    public void toJSON(ArrayList<EmployeeModel> employees, ArrayList<HashMap<String, Object>> departments) {

        try {
            String jarFolder = new File(FileService.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile().getPath().replace('\\', '/');
            JSONArray employeeList = new JSONArray();
            employees.forEach((value) -> {
                JSONObject object = new JSONObject();
                object.put("username", value.getUsername());
                object.put("password", value.getPassword());

                if (!value.getUsername().equals("admin")) {
//                    System.err.println("entered");
                    object.put("fName", value.getFirst_name());
                    object.put("lName", value.getLast_name());
                    object.put("gender", value.getGender());
                    object.put("counter", value.getCounter());
                    object.put("department", value.getDepartment());
                    object.put("status", getStatus(value.isLocked()));
                }
                employeeList.add(object);
            });
            JSONArray departmentsList = (JSONArray) departments;

            JSONObject empObject = new JSONObject();
            JSONObject depObject = new JSONObject();

            empObject.put("users", employeeList);
            depObject.put("department", departmentsList);

            JSONArray compile = new JSONArray();
            compile.add(empObject);
            compile.add(depObject);

//            System.out.println(compile);
            FileWriter writer = new FileWriter(jarFolder + "/res/codx.json");
            writer.write(compile.toJSONString());
            writer.close();

        } catch (Exception e) {
        }
    }

    private String getStatus(boolean status) {
        return status ? "locked" : "unlocked";
    }
}
