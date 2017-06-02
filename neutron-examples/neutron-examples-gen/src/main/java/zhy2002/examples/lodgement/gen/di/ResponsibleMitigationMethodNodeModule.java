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
public class ResponsibleMitigationMethodNodeModule {

    private final ResponsibleMitigationMethodNode owner;

    public ResponsibleMitigationMethodNodeModule(ResponsibleMitigationMethodNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ResponsibleMitigationMethodNode provideResponsibleMitigationMethodNode() {
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

    @Provides @Named("ResponsibleMitigationMethodNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ResponsibleMitigationMethodNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ResponsibleMitigationMethodNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ResponsibleMitigationMethodNode> provideTypeRuleProvider(ResponsibleMitigationMethodNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ResponsibleMitigationMethodNode>> provideRuleProviders(
        @Named("ResponsibleMitigationMethodNodeRuleProvider")  Map<String, Provider<RuleProvider<ResponsibleMitigationMethodNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}