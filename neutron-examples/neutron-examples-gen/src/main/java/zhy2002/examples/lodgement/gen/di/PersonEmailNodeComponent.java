package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PersonEmailNodeScope
@Subcomponent(modules = {PersonEmailNodeModule.class})
public interface PersonEmailNodeComponent {

    PersonEmailNodeRuleProvider getPersonEmailNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonEmailNodeModule(PersonEmailNodeModule module);

        PersonEmailNodeComponent build();
    }
}
