package com.zhaoyu.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})



/*@Target 是Java的元注解（指修饰注解的注解）之一。用来指定注解修饰类的哪个成员。
加大括号表示一个数组，指被修饰的注解能用于多个不同的类成员。
举个栗子：

@Target(ElementType.FIELD)
public @interface A{}

表示注解A只能用来修饰类中的Field

@Target({ElementType.FIELD, ElementType.METHOD})
public @interface A{}

表示注解A能用来修饰类中的Field和Method*/


@Retention(RetentionPolicy.RUNTIME)
//RetentionPolicy这个枚举类型的常量描述保留注释的各种策略，他们与元注释（@Retention）一起制定注释要保留多长时间
@Documented
public @interface Quatifier {
	String value() default "";
     // 表示给Controller注册别名
}
