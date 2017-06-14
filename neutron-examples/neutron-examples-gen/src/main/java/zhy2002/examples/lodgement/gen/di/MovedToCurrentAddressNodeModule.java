package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class MovedToCurrentAddressNodeModule {

    private final MovedToCurrentAddressNode owner;

    public MovedToCurrentAddressNodeModule(MovedToCurrentAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MovedToCurrentAddressNode provideMovedToCurrentAddressNode() {
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

    @Provides @Named("MovedToCurrentAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MovedToCurrentAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MovedToCurrentAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MovedToCurrentAddressNode> provideTypeRuleProvider(MovedToCurrentAddressNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MovedToCurrentAddressNode>> provideRuleProviders(
        @Named("MovedToCurrentAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<MovedToCurrentAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}