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
public class ResponsibleRepaymentDifficultyNodeModule {

    private final ResponsibleRepaymentDifficultyNode owner;

    public ResponsibleRepaymentDifficultyNodeModule(ResponsibleRepaymentDifficultyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleRepaymentDifficultyNode provideResponsibleRepaymentDifficultyNode() {
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

    @Provides @ComponentScope BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
        return owner.getParent();
    }

    @Provides @Named("ResponsibleRepaymentDifficultyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ResponsibleRepaymentDifficultyNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ResponsibleRepaymentDifficultyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ResponsibleRepaymentDifficultyNode> provideTypeRuleProvider(ResponsibleRepaymentDifficultyNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ResponsibleRepaymentDifficultyNode>> provideRuleProviders(
        @Named("ResponsibleRepaymentDifficultyNodeRuleProvider")  Map<String, Provider<RuleProvider<ResponsibleRepaymentDifficultyNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}