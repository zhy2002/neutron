package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonPrivacyNodeModule {

    private final PersonPrivacyNode owner;

    public PersonPrivacyNodeModule(PersonPrivacyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonPrivacyNode providePersonPrivacyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePrivacyNode<?> provideBasePrivacyNode() {
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
    RuleProvider<PersonPrivacyNode> provideRuleProvider(Provider<PersonPrivacyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PersonPrivacyNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonPrivacyNodeRuleProvider> personPrivacyNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonPrivacyNode>> result = new HashMap<>();
        result.put("personPrivacyNode", personPrivacyNodeRuleProvider.get());
        return result;
    }
}