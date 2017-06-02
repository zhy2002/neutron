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
public class ThirdPartyTitleNodeModule {

    private final ThirdPartyTitleNode owner;

    public ThirdPartyTitleNodeModule(ThirdPartyTitleNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyTitleNode provideThirdPartyTitleNode() {
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

    @Provides @ComponentScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @Named("ThirdPartyTitleNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyTitleNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyTitleNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyTitleNode> provideTypeRuleProvider(ThirdPartyTitleNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyTitleNode>> provideRuleProviders(
        @Named("ThirdPartyTitleNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyTitleNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}