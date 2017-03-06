package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PersonContactNodeScope
@Subcomponent(modules = {PersonContactNodeModule.class})
public interface PersonContactNodeComponent {

    PersonContactNodeRuleProvider getPersonContactNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonContactNodeModule(PersonContactNodeModule module);

        PersonContactNodeComponent build();
    }
}
