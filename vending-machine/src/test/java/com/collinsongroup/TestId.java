package com.collinsongroup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A meta annotation for tests to associate them with either a valid test number if applicable, or a
 * defect number within JIRA.
 * <p>
 * The purpose of the TestId will be to eventually allow for accurate test coverage reporting and to
 * increase traceability where a developer may be interested in understanding the purpose of the
 * test at a later time in case it needs to be changed/removed.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface TestId {

	String[] value();
}