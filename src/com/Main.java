package com;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException, InterruptedException {
        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss=new StringSelection("my string");
        clipboard.setContents(ss,null);
        Thread.sleep(3000);
        DataFlavor flavor=DataFlavor.stringFlavor;
        clipboard.getData(flavor);
        if(clipboard.isDataFlavorAvailable(flavor)){
            System.out.println(clipboard.getData(flavor));
        }
    }
}
