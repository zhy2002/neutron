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

    @Provides @PersonListNodeScope @Owner PersonListNode providePersonListNode() {
        return owner;
    }

    @Provides @PersonListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @PersonListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonListNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @PersonListNodeScope
    RuleProvider<PersonListNode> provideRuleProvider(Provider<PersonListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PersonListNodeScope
    Map<String, RuleProvider<PersonListNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.PersonListNodeRuleProvider> personListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonListNode>> result = new HashMap<>();
        result.put("personListNode", personListNodeRuleProvider.get());
        return result;
    }
}