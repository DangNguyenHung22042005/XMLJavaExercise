package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DirToXML {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of file:");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Folder is not exist!");
            return;
        }
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlBuilder.append("<directory>\n");
        generateXML(directory, xmlBuilder,1);
        xmlBuilder.append("</directory>");

        try {
            FileWriter writer = new FileWriter("file.xml");
            writer.write(xmlBuilder.toString());
            writer.close();
            System.out.println("FXML File is created successful!");
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }

    private static void generateXML(File directory, StringBuilder xmlBuilder, int indentLevel) {
        String indent = "  ".repeat(indentLevel);       
        xmlBuilder.append(indent).append("<").append(directory.getName()).append(">\n");
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    generateXML(file, xmlBuilder,indentLevel+1);
                } else {
                    xmlBuilder.append(indent).append("     <file>").append(file.getName()).append("</file>\n");
                }
            }
        }
        xmlBuilder.append(indent).append("</").append(directory.getName()).append(">\n");
    }
}	
