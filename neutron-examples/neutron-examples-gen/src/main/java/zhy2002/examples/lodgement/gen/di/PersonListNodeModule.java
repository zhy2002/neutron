package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonListNodeModule {

    private final PersonListNode owner;

    public PersonListNodeModule(PersonListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonListNode providePersonListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonListNode> provideRuleProvider(Provider<PersonListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonListNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.PersonListNodeRuleProvider> personListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonListNode>> result = new HashMap<>();
        result.put("personListNode", personListNodeRuleProvider.get());
        return result;
    }
}