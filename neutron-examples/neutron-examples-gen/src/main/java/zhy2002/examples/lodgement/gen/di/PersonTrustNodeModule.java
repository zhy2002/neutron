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

    @Provides @PersonTrustNodeScope @Owner PersonTrustNode providePersonTrustNode() {
        return owner;
    }

    @Provides @PersonTrustNodeScope @Owner BaseTrustNode<?> provideBaseTrustNode() {
        return owner;
    }

    @Provides @PersonTrustNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonTrustNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonTrustNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonTrustNodeScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @PersonTrustNodeScope
    Map<String, RuleProvider<PersonTrustNode>> provideInstanceProviders(
        Provider<PersonNodeChildProvider.PersonTrustNodeRuleProvider> personTrustNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonTrustNode>> result = new HashMap<>();
        result.put("personTrustNode", personTrustNodeRuleProvider.get());
        return result;
    }
}