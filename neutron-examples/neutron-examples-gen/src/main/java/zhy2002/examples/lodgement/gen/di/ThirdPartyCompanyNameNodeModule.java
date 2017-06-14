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
public class ThirdPartyCompanyNameNodeModule {

    private final ThirdPartyCompanyNameNode owner;

    public ThirdPartyCompanyNameNodeModule(ThirdPartyCompanyNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyCompanyNameNode provideThirdPartyCompanyNameNode() {
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

    @Provides @Named("ThirdPartyCompanyNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyCompanyNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyCompanyNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyCompanyNameNode> provideTypeRuleProvider(ThirdPartyCompanyNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyCompanyNameNode>> provideRuleProviders(
        @Named("ThirdPartyCompanyNameNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyCompanyNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}