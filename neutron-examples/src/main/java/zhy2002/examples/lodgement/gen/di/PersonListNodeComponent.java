package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonListNodeScope
@Subcomponent(modules = {PersonListNodeModule.class})
public interface PersonListNodeComponent {

    PersonListNodeRuleProvider getPersonListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonListNodeModule(PersonListNodeModule module);

        PersonListNodeComponent build();
    }
}
