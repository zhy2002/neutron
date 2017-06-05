package zhy2002.examples.app.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class SiteLogoNodeModule {

    private final SiteLogoNode owner;

    public SiteLogoNodeModule(SiteLogoNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SiteLogoNode provideSiteLogoNode() {
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

    @Provides @ComponentScope MenuNode provideMenuNode() {
        return owner.getParent();
    }

    @Provides @Named("SiteLogoNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SiteLogoNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SiteLogoNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SiteLogoNode> provideTypeRuleProvider(SiteLogoNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SiteLogoNode>> provideRuleProviders(
        @Named("SiteLogoNodeRuleProvider")  Map<String, Provider<RuleProvider<SiteLogoNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}