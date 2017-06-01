package zhy2002.examples.app.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class LodgementNodeModule {

    private final LodgementNode owner;

    public LodgementNodeModule(LodgementNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LodgementNode provideLodgementNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner RootUiNode<?> provideRootUiNode() {
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

    @Provides @Named("LodgementNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LodgementNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LodgementNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LodgementNode> provideTypeRuleProvider(LodgementNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LodgementNode>> provideRuleProviders(
        @Named("LodgementNodeRuleProvider")  Map<String, Provider<RuleProvider<LodgementNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}