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
public class FirstNameNodeModule {

    private final FirstNameNode owner;

    public FirstNameNodeModule(FirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner FirstNameNode provideFirstNameNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("FirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<FirstNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("FirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<FirstNameNode> provideTypeRuleProvider(FirstNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<FirstNameNode>> provideRuleProviders(
        @Named("FirstNameNodeRuleProvider")  Map<String, Provider<RuleProvider<FirstNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}