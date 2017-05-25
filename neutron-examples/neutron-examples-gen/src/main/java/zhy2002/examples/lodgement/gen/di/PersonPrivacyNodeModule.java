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

    @Provides @PersonPrivacyNodeScope @Owner PersonPrivacyNode providePersonPrivacyNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @PersonPrivacyNodeScope
    RuleProvider<PersonPrivacyNode> provideRuleProvider(Provider<PersonPrivacyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PersonPrivacyNodeScope
    Map<String, RuleProvider<PersonPrivacyNode>> provideInstanceProviderMap(
        Provider<PersonNodeChildProvider.PersonPrivacyNodeRuleProvider> personPrivacyNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonPrivacyNode>> result = new HashMap<>();
        result.put("personPrivacyNode", personPrivacyNodeRuleProvider.get());
        return result;
    }
}