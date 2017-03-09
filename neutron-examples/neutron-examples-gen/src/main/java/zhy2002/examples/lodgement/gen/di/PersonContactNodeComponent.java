package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@PersonContactNodeScope
@Subcomponent(modules = {PersonContactNodeModule.class})
public interface PersonContactNodeComponent {

    PersonContactNodeRuleProvider getPersonContactNodeRuleProvider();
    Map<String, RuleProvider<PersonContactNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonContactNodeModule(PersonContactNodeModule module);

        PersonContactNodeComponent build();
    }
}
