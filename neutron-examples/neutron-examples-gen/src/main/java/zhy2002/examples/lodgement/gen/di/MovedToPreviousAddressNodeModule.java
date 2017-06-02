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
public class MovedToPreviousAddressNodeModule {

    private final MovedToPreviousAddressNode owner;

    public MovedToPreviousAddressNodeModule(MovedToPreviousAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MovedToPreviousAddressNode provideMovedToPreviousAddressNode() {
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

    @Provides @Named("MovedToPreviousAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MovedToPreviousAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MovedToPreviousAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MovedToPreviousAddressNode> provideTypeRuleProvider(MovedToPreviousAddressNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MovedToPreviousAddressNode>> provideRuleProviders(
        @Named("MovedToPreviousAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<MovedToPreviousAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}