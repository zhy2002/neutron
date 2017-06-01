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
public class ResponsibleSignificantChangeFlagNodeModule {

    private final ResponsibleSignificantChangeFlagNode owner;

    public ResponsibleSignificantChangeFlagNodeModule(ResponsibleSignificantChangeFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleSignificantChangeFlagNode provideResponsibleSignificantChangeFlagNode() {
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

    @Provides @Named("ResponsibleSignificantChangeFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ResponsibleSignificantChangeFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ResponsibleSignificantChangeFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ResponsibleSignificantChangeFlagNode> provideTypeRuleProvider(ResponsibleSignificantChangeFlagNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ResponsibleSignificantChangeFlagNodeRuleProvider") @IntoMap @StringKey("responsibleSignificantChangeFlagNode")
        RuleProvider<ResponsibleSignificantChangeFlagNode> provideResponsibleSignificantChangeFlagNodeChildRuleProvider(
            BaseResponsibleLendNodeChildProvider.ResponsibleSignificantChangeFlagNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ResponsibleSignificantChangeFlagNode>> provideRuleProviders(
        @Named("ResponsibleSignificantChangeFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ResponsibleSignificantChangeFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}