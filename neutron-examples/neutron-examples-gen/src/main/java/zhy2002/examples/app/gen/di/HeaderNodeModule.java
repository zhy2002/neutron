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
public class HeaderNodeModule {

    private final HeaderNode owner;

    public HeaderNodeModule(HeaderNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner HeaderNode provideHeaderNode() {
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

    @Provides @ComponentScope GlobalUiStateNode provideGlobalUiStateNode() {
        return owner.getParent();
    }

    @Provides @Named("HeaderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<HeaderNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("HeaderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<HeaderNode> provideTypeRuleProvider(HeaderNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<HeaderNode>> provideRuleProviders(
        @Named("HeaderNodeRuleProvider")  Map<String, Provider<RuleProvider<HeaderNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}