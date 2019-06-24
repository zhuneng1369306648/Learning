package com.zy.test;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MainTest {
	public static void main(String[] args) {
		
		try {
			SAXReader reader = new SAXReader();
			Document document=reader.read(new File("src/xml/stusxml.xml"));
			Element rootElement = document.getRootElement();
			//rootElement.element("stu");
			List<Element> elements = rootElement.elements();
			for(Element element :elements) {
				String name = element.element("name").getText();
				String age = element.element("age").getText();
				String address = element.element("address").getText();
				System.out.println("name="+name+"==age"+age+"==addredd"+address);
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
