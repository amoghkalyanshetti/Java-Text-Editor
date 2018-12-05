/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions.menubar;

import gui.TextEditor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author amogh
 */
public class FileMenuFunctions 
{
    public JTextArea copyFileToEditor(JTextArea editor,File file)
    {
        Scanner fileScanner = null;
            try 
            {
                fileScanner =new Scanner(file);
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
            while(fileScanner.hasNextLine())
            {
                editor.setText(editor.getText()+fileScanner.nextLine()+"\n");
            }
            fileScanner.close();
            return editor;
    }
    
    public static void writeToFile(File file,String string) throws IOException 
    {

        //try with resources (new feature of java 8)
        try 
        ( 
            BufferedReader reader = new BufferedReader(new StringReader(string));
            PrintWriter writer = new PrintWriter(new FileWriter(file));
        )   
        {
            reader.lines().forEach(line -> writer.println(line));
        }
    }
}
