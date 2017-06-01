package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class MovedFromPreviousAddressNodeModule {

    private final MovedFromPreviousAddressNode owner;

    public MovedFromPreviousAddressNodeModule(MovedFromPreviousAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MovedFromPreviousAddressNode provideMovedFromPreviousAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
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

    @Provides @ComponentScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @Named("MovedFromPreviousAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MovedFromPreviousAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MovedFromPreviousAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MovedFromPreviousAddressNode> provideTypeRuleProvider(MovedFromPreviousAddressNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("MovedFromPreviousAddressNodeRuleProvider") @IntoMap @StringKey("movedFromPreviousAddressNode")
        RuleProvider<MovedFromPreviousAddressNode> provideMovedFromPreviousAddressNodeChildRuleProvider(
            PersonContactNodeChildProvider.MovedFromPreviousAddressNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<MovedFromPreviousAddressNode>> provideRuleProviders(
        @Named("MovedFromPreviousAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<MovedFromPreviousAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}