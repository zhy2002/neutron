package zhy2002.examples.di.nodes;

import javax.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Scope
@Documented
public @interface DummyListAItemScope {
}
