package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PersonListNodeModule.class})
public interface PersonListNodeComponent {

    RuleProvider<PersonListNode> getPersonListNodeRuleProvider();
    Map<String, RuleProvider<PersonListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonListNodeModule(PersonListNodeModule module);

        PersonListNodeComponent build();
    }
}
