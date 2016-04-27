package au.com.dius.pact.provider.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to control the generation of verification reports
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface VerificationReports {

  /**
   * Names of the reports to generate
   */
  String[] value() default "console";

  /**
   * Directory where reports should be written
   */
  String reportDir() default "target/pact/reports";

}