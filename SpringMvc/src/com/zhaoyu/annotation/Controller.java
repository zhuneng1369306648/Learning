package com.zhaoyu.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
//ElementType 这个枚举类型的常量提供一个简单的分类：注释可能出现在java程序中的语法位置（这些常量与元注释型（@Target）
//一起指定在何处写入注释的合法位置）
@Retention(RetentionPolicy.RUNTIME)
//RetentionPolicy这个枚举类型的常量描述保留注释的各种策略，他们与元注释（@Retention）一起制定注释要保留多长时间
@Documented
public @interface Controller {
	String value() default "";
     // 表示给Controller注册别名
}
