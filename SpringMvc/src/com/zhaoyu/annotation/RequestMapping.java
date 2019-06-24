package com.zhaoyu.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})//在方法上的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface RequestMapping {
    String value() default "";
}

/*取值 	注解使用范围
METHOD 	可用于方法上
TYPE 	可用于类或者接口上
ANNOTATION_TYPE 	可用于注解类型上（被@interface修饰的类型）
CONSTRUCTOR 	可用于构造方法上
FIELD 	可用于域上
LOCAL_VARIABLE 	可用于局部变量上
PACKAGE 	用于记录java文件的package信息
PARAMETER 	可用于参数上
*/