package tests.testXML;

import tests.testXML.dao.IDao;
import xmlConf.ClassPathXmlApplicationContext;

public class presentationXml {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/main/resources/applicationContext.xml");
        IDao dao = (IDao) context.getBean("dao");

        System.out.println(dao.getData());

    }

}
