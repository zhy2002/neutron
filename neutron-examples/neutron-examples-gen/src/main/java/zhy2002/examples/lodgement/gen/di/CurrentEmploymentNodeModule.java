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
public class CurrentEmploymentNodeModule {

    private final CurrentEmploymentNode owner;

    public CurrentEmploymentNodeModule(CurrentEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CurrentEmploymentNode provideCurrentEmploymentNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmploymentNode<?> provideEmploymentNode() {
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

    @Provides @ComponentScope CurrentEmploymentListNode provideCurrentEmploymentListNode() {
        return owner.getParent();
    }

    @Provides @Named("CurrentEmploymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CurrentEmploymentNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CurrentEmploymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CurrentEmploymentNode> provideTypeRuleProvider(CurrentEmploymentNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CurrentEmploymentNode>> provideRuleProviders(
        @Named("CurrentEmploymentNodeRuleProvider")  Map<String, Provider<RuleProvider<CurrentEmploymentNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}