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
public class LastNameNodeModule {

    private final LastNameNode owner;

    public LastNameNodeModule(LastNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LastNameNode provideLastNameNode() {
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

    @Provides @Named("LastNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LastNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LastNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LastNameNode> provideTypeRuleProvider(LastNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LastNameNode>> provideRuleProviders(
        @Named("LastNameNodeRuleProvider")  Map<String, Provider<RuleProvider<LastNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}