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
public class ResponsibleTypeOfChangeNodeModule {

    private final ResponsibleTypeOfChangeNode owner;

    public ResponsibleTypeOfChangeNodeModule(ResponsibleTypeOfChangeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleTypeOfChangeNode provideResponsibleTypeOfChangeNode() {
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

    @Provides @Named("ResponsibleTypeOfChangeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ResponsibleTypeOfChangeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ResponsibleTypeOfChangeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ResponsibleTypeOfChangeNode> provideTypeRuleProvider(ResponsibleTypeOfChangeNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ResponsibleTypeOfChangeNodeRuleProvider") @IntoMap @StringKey("responsibleTypeOfChangeNode")
        RuleProvider<ResponsibleTypeOfChangeNode> provideResponsibleTypeOfChangeNodeChildRuleProvider(
            BaseResponsibleLendNodeChildProvider.ResponsibleTypeOfChangeNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ResponsibleTypeOfChangeNode>> provideRuleProviders(
        @Named("ResponsibleTypeOfChangeNodeRuleProvider")  Map<String, Provider<RuleProvider<ResponsibleTypeOfChangeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}