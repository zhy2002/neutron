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
public class OtherAssetTypeNodeModule {

    private final OtherAssetTypeNode owner;

    public OtherAssetTypeNodeModule(OtherAssetTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherAssetTypeNode provideOtherAssetTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherAssetTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherAssetTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherAssetTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherAssetTypeNode> provideTypeRuleProvider(OtherAssetTypeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherAssetTypeNode>> provideRuleProviders(
        @Named("OtherAssetTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherAssetTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}