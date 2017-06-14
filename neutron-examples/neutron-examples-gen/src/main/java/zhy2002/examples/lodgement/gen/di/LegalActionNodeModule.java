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
public class LegalActionNodeModule {

    private final LegalActionNode owner;

    public LegalActionNodeModule(LegalActionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LegalActionNode provideLegalActionNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
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

    @Provides @ComponentScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @Named("LegalActionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LegalActionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LegalActionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LegalActionNode> provideTypeRuleProvider(LegalActionNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LegalActionNode>> provideRuleProviders(
        @Named("LegalActionNodeRuleProvider")  Map<String, Provider<RuleProvider<LegalActionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}