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
public class ThirdPartyLastNameNodeModule {

    private final ThirdPartyLastNameNode owner;

    public ThirdPartyLastNameNodeModule(ThirdPartyLastNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyLastNameNode provideThirdPartyLastNameNode() {
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

    @Provides @Named("ThirdPartyLastNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyLastNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyLastNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyLastNameNode> provideTypeRuleProvider(ThirdPartyLastNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyLastNameNode>> provideRuleProviders(
        @Named("ThirdPartyLastNameNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyLastNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}