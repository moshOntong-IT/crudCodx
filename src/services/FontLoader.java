/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ACER
 */
public class FontLoader {

    public void checkFont(String nameString, String path) {
        loadFont(nameString, path);
    }

    protected void loadFont(String font, String path) {
        GraphicsEnvironment g = null;
        g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = g.getAvailableFontFamilyNames();
        boolean isExist = true;
        for (int i = 0; i < fonts.length; i++) {
//            System.out.println(fonts[i]);
            if (fonts[i].equals(font)) {
                System.out.println("[INFO]:" + font + " Found!");
                isExist = true;
                break;
            } else {
                isExist = false;
            }
        }

        if (!isExist) {
            System.out.println("[FAILED]: " + font + " font is not "
                    + "availabe in your system. Try to installing Baloo Bhai "
                    + "please wait...");
            getFont(font,path);
        }
    }

    private void getFont(String fontName,String fontPath) {
        System.out.println("[INFO]:Installing font...");
        try {
            InputStream is = FontLoader.class.getClassLoader().getResourceAsStream(fontPath);
            GraphicsEnvironment ge
                    = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, is));
        } catch (IOException | FontFormatException e) {
            System.err.println(e);
        }
        System.out.println("[INFO]:Checking font again...");
        checkFont(fontName, fontPath);
    }

}
