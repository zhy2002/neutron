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
public class OtherLiabilityNodeModule {

    private final OtherLiabilityNode owner;

    public OtherLiabilityNodeModule(OtherLiabilityNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityNode provideOtherLiabilityNode() {
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

    @Provides @ComponentScope OtherLiabilityListNode provideOtherLiabilityListNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherLiabilityNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherLiabilityNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherLiabilityNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherLiabilityNode> provideTypeRuleProvider(OtherLiabilityNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherLiabilityNode>> provideRuleProviders(
        @Named("OtherLiabilityNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherLiabilityNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}