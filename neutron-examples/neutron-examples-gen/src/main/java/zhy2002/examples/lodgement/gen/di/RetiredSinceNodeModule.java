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
public class RetiredSinceNodeModule {

    private final RetiredSinceNode owner;

    public RetiredSinceNodeModule(RetiredSinceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RetiredSinceNode provideRetiredSinceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
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

    @Provides @ComponentScope RetiredEmploymentNode provideRetiredEmploymentNode() {
        return owner.getParent();
    }

    @Provides @Named("RetiredSinceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RetiredSinceNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RetiredSinceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RetiredSinceNode> provideTypeRuleProvider(RetiredSinceNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<RetiredSinceNode>> provideRuleProviders(
        @Named("RetiredSinceNodeRuleProvider")  Map<String, Provider<RuleProvider<RetiredSinceNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}