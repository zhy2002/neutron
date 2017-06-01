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
public class RetiredEmploymentNodeModule {

    private final RetiredEmploymentNode owner;

    public RetiredEmploymentNodeModule(RetiredEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RetiredEmploymentNode provideRetiredEmploymentNode() {
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

    @Provides @ComponentScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @Named("RetiredEmploymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RetiredEmploymentNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RetiredEmploymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RetiredEmploymentNode> provideTypeRuleProvider(RetiredEmploymentNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("RetiredEmploymentNodeRuleProvider") @IntoMap @StringKey("retiredEmploymentNode")
        RuleProvider<RetiredEmploymentNode> provideRetiredEmploymentNodeChildRuleProvider(
            EmploymentNodeChildProvider.RetiredEmploymentNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<RetiredEmploymentNode>> provideRuleProviders(
        @Named("RetiredEmploymentNodeRuleProvider")  Map<String, Provider<RuleProvider<RetiredEmploymentNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}