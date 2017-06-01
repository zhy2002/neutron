package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonTrustNodeModule {

    private final PersonTrustNode owner;

    public PersonTrustNodeModule(PersonTrustNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonTrustNode providePersonTrustNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseTrustNode<?> provideBaseTrustNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PersonTrustNode> provideRuleProvider(Provider<PersonTrustNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonTrustNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonTrustNodeRuleProvider> personTrustNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonTrustNode>> result = new HashMap<>();
        result.put("personTrustNode", personTrustNodeRuleProvider.get());
        return result;
    }
}