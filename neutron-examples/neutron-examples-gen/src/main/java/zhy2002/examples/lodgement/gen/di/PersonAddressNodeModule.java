package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PersonAddressNodeModule {

    private final PersonAddressNode owner;

    public PersonAddressNodeModule(PersonAddressNode owner) {
        this.owner = owner;
    }

    @Provides @PersonAddressNodeScope @Owner PersonAddressNode providePersonAddressNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @PersonAddressNodeScope
    RuleProvider<PersonAddressNode> provideRuleProvider(Provider<PersonAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PersonAddressNodeScope
    Map<String, RuleProvider<PersonAddressNode>> provideInstanceProviderMap(
        Provider<PersonContactNodeChildProvider.CurrentAddressNodeRuleProvider> currentAddressNodeRuleProvider
        ,Provider<PersonContactNodeChildProvider.PostalAddressNodeRuleProvider> postalAddressNodeRuleProvider
        ,Provider<PersonContactNodeChildProvider.PreviousAddressNodeRuleProvider> previousAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<PersonAddressNode>> result = new HashMap<>();
        result.put("currentAddressNode", currentAddressNodeRuleProvider.get());
        result.put("postalAddressNode", postalAddressNodeRuleProvider.get());
        result.put("previousAddressNode", previousAddressNodeRuleProvider.get());
        return result;
    }
}