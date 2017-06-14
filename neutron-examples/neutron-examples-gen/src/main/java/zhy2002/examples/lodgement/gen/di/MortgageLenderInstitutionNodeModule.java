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
public class MortgageLenderInstitutionNodeModule {

    private final MortgageLenderInstitutionNode owner;

    public MortgageLenderInstitutionNodeModule(MortgageLenderInstitutionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageLenderInstitutionNode provideMortgageLenderInstitutionNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @Named("MortgageLenderInstitutionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MortgageLenderInstitutionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MortgageLenderInstitutionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MortgageLenderInstitutionNode> provideTypeRuleProvider(MortgageLenderInstitutionNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MortgageLenderInstitutionNode>> provideRuleProviders(
        @Named("MortgageLenderInstitutionNodeRuleProvider")  Map<String, Provider<RuleProvider<MortgageLenderInstitutionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}