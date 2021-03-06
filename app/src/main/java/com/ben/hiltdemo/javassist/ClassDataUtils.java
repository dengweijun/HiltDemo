package com.ben.hiltdemo.javassist;

import java.lang.reflect.Method;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;

/**
 * @description:
 * @author: mengzi.deng <a href="mailto:developer@tuya.com"/>
 * @since: 2021/7/9 09:12
 */
public class ClassDataUtils {

    public static void modifyClassData() {
        try {
            ClassPool pool = ClassPool.getDefault();
            // 获取一个Student类的CtClass对象
            CtClass ctClass = pool.get("com.ben.hiltdemo.javassist.Student");
            // 设置父类
            ctClass.setSuperclass(pool.get("com.ben.hiltdemo.javassist.Person"));
            // 添加Filed
            ctClass.addField(CtField.make("private String name;", ctClass));
            ctClass.addMethod(CtMethod.make("public void setName(String name){this.name=name;}", ctClass));
            ctClass.addMethod(CtMethod.make("public String getName(){ return this.name;}", ctClass));

            Class studentClass = ctClass.toClass();
            Method getNameMethod = studentClass.getMethod("getName");
            Method setNameMethod = studentClass.getMethod("setName", String.class);
            Method getFatherNameMethod = studentClass.getMethod("getPersonName");

            Student student = (Student) studentClass.newInstance();
            setNameMethod.invoke(student, "zhangsan");

            String name = (String) getNameMethod.invoke(student);
            System.out.println("name=" + name);

            String fartherName = (String) getFatherNameMethod.invoke(student);
            System.out.println("fatherName=" + fartherName);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
