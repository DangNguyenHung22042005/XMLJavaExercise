package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;

public class XMLForStudent {
	public static void main(String[] args) {
		List<StudentInfo> students = new ArrayList<>();
		students.add(new StudentInfo("Thuy", 18, 3.5));
		students.add(new StudentInfo("Lan", 19, 3.4));
		students.add(new StudentInfo("Ngoc", 20, 3.3));
		students.add(new StudentInfo("Hung", 19, 3.2));
		students.add(new StudentInfo("Huy", 19, 4.0));
		
		try {
			FileWriter writer = new FileWriter("students.xml");
			writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			writer.write("<students>\n");
			for (StudentInfo student : students) {
				writer.write("  <student>\n");
				writer.write("    <name>" + student.getName() + "</name>\n");
				writer.write("    <age>" + student.getAge() + "</age>\n");
				writer.write("    <gpa>" + student.getGpa() + "</gpa>\n");
				writer.write("  </student>\n");
			}
			writer.write("</students>");
			writer.close();
			System.out.println("XML File is created successful!");
		} catch (IOException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}
}
