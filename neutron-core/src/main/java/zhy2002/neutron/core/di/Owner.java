package zhy2002.neutron.core.di;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A qualifier used to inject the owner node into rules and other accessories.
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Owner {
}
