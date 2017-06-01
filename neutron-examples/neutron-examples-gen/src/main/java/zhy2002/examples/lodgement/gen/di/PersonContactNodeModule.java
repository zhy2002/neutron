package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonContactNodeModule {

    private final PersonContactNode owner;

    public PersonContactNodeModule(PersonContactNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonContactNode providePersonContactNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonContactNode> provideRuleProvider(Provider<PersonContactNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonContactNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonContactNodeRuleProvider> personContactNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonContactNode>> result = new HashMap<>();
        result.put("personContactNode", personContactNodeRuleProvider.get());
        return result;
    }
}