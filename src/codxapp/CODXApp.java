/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codxapp;

import view.LoginView;
import assets.Constant;
import java.io.File;

import java.net.URISyntaxException;

import java.nio.file.Paths;

import services.FileService;
import services.FontLoader;
import services.UserController;

/**
 *
 * @author ACER
 */
public class CODXApp {

    /**
     * @param args the command line arguments
     */
    private static boolean isJsonReady;

    ;
    public static void main(String[] args) throws URISyntaxException {
        FontLoader loader = new FontLoader();
        FileService fileLoader = new FileService();

        String path = CODXApp.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String cwd = Paths.get("").toAbsolutePath().toString().replace('\\', '/');
        String jarFolder = new File(CODXApp.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile().getPath().replace('\\', '/');
        isJsonReady = false;
        //fetching path of jar
        System.out.println("[INFO]: The Jar file located at " + path);
        System.out.println("[INFO]: The Jar Folder located at " + jarFolder);
        System.out.println("[INFO]: Currently working folder " + cwd);

        //copying json
        if (fileLoader.copyFile(CODXApp.class.getResourceAsStream("/assets/codx.json"), jarFolder)) {
            System.out.println("[SUCCESS]: Copied");
        } else {
            System.out.println("[INFO]:File is already exist");
        }

        //fetching need font data
        loader.checkFont(Constant.fontString1, Constant.fontStringPath1);
        loader.checkFont(Constant.fontString2, Constant.fontStringPath2);
        loader.checkFont(Constant.fontString3, Constant.fontStringPath3);
        loader.checkFont(Constant.fontString4, Constant.fontStringPath4);

//       begin to engage
        UserController controller = new UserController();
//        controller.getEmployeeList(((model) -> {
//            System.out.println("[INFO]:Status=" + model.isLocked());
//        }));
        fileLoader.checkFile((datas) -> {
            System.out.println("[Information Recieved]: " + String.valueOf(datas).substring(0, 30) + "...");
            if (!datas.isEmpty()) {
                isJsonReady = true;
            }
        });

        if (isJsonReady) {
            new LoginView(controller).setVisible(true);
            System.out.println("[SUCCESS]: System is running...");
        } else {
            System.out.println("[ERROR]: Failed to run the system");
        }
    }

}
