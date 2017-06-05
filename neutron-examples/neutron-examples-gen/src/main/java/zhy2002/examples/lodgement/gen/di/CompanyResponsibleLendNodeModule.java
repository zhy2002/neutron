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
public class CompanyResponsibleLendNodeModule {

    private final CompanyResponsibleLendNode owner;

    public CompanyResponsibleLendNodeModule(CompanyResponsibleLendNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyResponsibleLendNode provideCompanyResponsibleLendNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
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

    @Provides @ComponentScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanyResponsibleLendNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyResponsibleLendNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyResponsibleLendNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyResponsibleLendNode> provideTypeRuleProvider(CompanyResponsibleLendNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyResponsibleLendNode>> provideRuleProviders(
        @Named("CompanyResponsibleLendNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyResponsibleLendNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}