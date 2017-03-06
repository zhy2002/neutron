package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PersonNodeScope
@Subcomponent(modules = {PersonNodeModule.class})
public interface PersonNodeComponent {

    PersonNodeRuleProvider getPersonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonNodeModule(PersonNodeModule module);

        PersonNodeComponent build();
    }
}
