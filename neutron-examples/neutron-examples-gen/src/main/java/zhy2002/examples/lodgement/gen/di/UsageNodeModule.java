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
public class UsageNodeModule {

    private final UsageNode owner;

    public UsageNodeModule(UsageNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UsageNode provideUsageNode() {
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

    @Provides @ComponentScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

    @Provides @Named("UsageNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<UsageNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("UsageNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<UsageNode> provideTypeRuleProvider(UsageNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<UsageNode>> provideRuleProviders(
        @Named("UsageNodeRuleProvider")  Map<String, Provider<RuleProvider<UsageNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}