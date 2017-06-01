package zhy2002.neutron.di;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A qualifier used to inject the child name into child node constructor.
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface ChildName {
}
