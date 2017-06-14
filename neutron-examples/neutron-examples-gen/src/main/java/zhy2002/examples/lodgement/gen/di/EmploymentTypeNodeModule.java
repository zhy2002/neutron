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
public class EmploymentTypeNodeModule {

    private final EmploymentTypeNode owner;

    public EmploymentTypeNodeModule(EmploymentTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmploymentTypeNode provideEmploymentTypeNode() {
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

    @Provides @ComponentScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @Named("EmploymentTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<EmploymentTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("EmploymentTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<EmploymentTypeNode> provideTypeRuleProvider(EmploymentTypeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<EmploymentTypeNode>> provideRuleProviders(
        @Named("EmploymentTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<EmploymentTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}