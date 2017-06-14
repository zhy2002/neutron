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
public class OtherAssetNodeModule {

    private final OtherAssetNode owner;

    public OtherAssetNodeModule(OtherAssetNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherAssetNode provideOtherAssetNode() {
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

    @Provides @ComponentScope OtherAssetListNode provideOtherAssetListNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherAssetNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherAssetNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherAssetNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherAssetNode> provideTypeRuleProvider(OtherAssetNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherAssetNode>> provideRuleProviders(
        @Named("OtherAssetNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherAssetNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}