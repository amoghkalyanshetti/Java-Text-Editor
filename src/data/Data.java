/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;

/**
 *
 * @author amogh
 * This class will hold the data required for each source file
 */
public class Data 
{
    private static int currentTabIndex=-1;
    private File file;//the file that is opened 
    private int tabIndex;//the index of the tab in which it is opened
    private boolean fileNameCreated;//used to check whether the fileName is created or not
    public Data()
    {
        currentTabIndex++;
        setTabIndex(currentTabIndex);
    }
    public boolean isFileNameCreated() 
    {
        return fileNameCreated;
    }

    public void setFileNameCreated(boolean fileNameCreated) 
    {
        this.fileNameCreated = fileNameCreated;
    }
    
    public File getFile() 
    {
        return file;
    }

    public void setFile(File file) 
    {
        this.file = file;
    }

    public int getTabIndex() 
    {
        return tabIndex;
    }

    public void setTabIndex(int tabIndex) 
    {
        this.tabIndex = tabIndex;
    }
    
}
