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
public class EmployerNameNodeModule {

    private final EmployerNameNode owner;

    public EmployerNameNodeModule(EmployerNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner EmployerNameNode provideEmployerNameNode() {
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

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @Named("EmployerNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<EmployerNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("EmployerNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<EmployerNameNode> provideTypeRuleProvider(EmployerNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<EmployerNameNode>> provideRuleProviders(
        @Named("EmployerNameNodeRuleProvider")  Map<String, Provider<RuleProvider<EmployerNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}