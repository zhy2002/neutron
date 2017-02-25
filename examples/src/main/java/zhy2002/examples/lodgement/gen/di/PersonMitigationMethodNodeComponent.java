package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PersonMitigationMethodNodeScope
@Subcomponent(modules = {PersonMitigationMethodNodeModule.class})
public interface PersonMitigationMethodNodeComponent {

    PersonMitigationMethodNodeRuleProvider getPersonMitigationMethodNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonMitigationMethodNodeModule(PersonMitigationMethodNodeModule module);

        PersonMitigationMethodNodeComponent build();
    }
}
