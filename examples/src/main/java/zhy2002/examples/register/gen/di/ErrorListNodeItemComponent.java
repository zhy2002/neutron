package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@ErrorListNodeItemScope
@Subcomponent(modules = {ErrorListNodeItemModule.class})
public interface ErrorListNodeItemComponent {

    ErrorNode provideErrorNode();

}
