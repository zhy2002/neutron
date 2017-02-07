package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@CurrentEmploymentListNodeItemScope
@Subcomponent(modules = {CurrentEmploymentListNodeItemModule.class})
public interface CurrentEmploymentListNodeItemComponent {

    CurrentEmploymentNode provideCurrentEmploymentNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentListNodeItemModule(CurrentEmploymentListNodeItemModule module);

        CurrentEmploymentListNodeItemComponent build();
    }
}
