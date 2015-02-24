package com.architecture.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
@Target(ElementType.METHOD)
@Retention({ RetentionPolicy.RUNTIME, RetentionPolicy.SOURCE })
public @interface Configuration {
}
