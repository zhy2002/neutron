package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonListNodeItemScope
@Subcomponent(modules = {PersonListNodeItemModule.class})
public interface PersonListNodeItemComponent {

    PersonNode providePersonNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonListNodeItemModule(PersonListNodeItemModule module);

        PersonListNodeItemComponent build();
    }
}
