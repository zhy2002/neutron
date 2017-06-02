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
public class LoanLenderNameNodeModule {

    private final LoanLenderNameNode owner;

    public LoanLenderNameNodeModule(LoanLenderNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanLenderNameNode provideLoanLenderNameNode() {
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

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @Named("LoanLenderNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LoanLenderNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LoanLenderNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LoanLenderNameNode> provideTypeRuleProvider(LoanLenderNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LoanLenderNameNode>> provideRuleProviders(
        @Named("LoanLenderNameNodeRuleProvider")  Map<String, Provider<RuleProvider<LoanLenderNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}