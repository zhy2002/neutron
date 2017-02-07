package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@ErrorListNodeItemScope
@Subcomponent(modules = {ErrorListNodeItemModule.class})
public interface ErrorListNodeItemComponent {

    ErrorNode provideErrorNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setErrorListNodeItemModule(ErrorListNodeItemModule module);

        ErrorListNodeItemComponent build();
    }
}
