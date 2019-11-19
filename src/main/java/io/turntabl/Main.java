package io.turntabl;

import javafx.application.Application;

public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        JDBCTemplate tmpl = (JDBCTemplatee) ctx.getBean("jdbcTemplate");

        int numRows = tmpl.queryForObject("");


    }
}
