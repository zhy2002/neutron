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
public class OccupationNodeModule {

    private final OccupationNode owner;

    public OccupationNodeModule(OccupationNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OccupationNode provideOccupationNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseOccupationNode<?> provideBaseOccupationNode() {
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

    @Provides @ComponentScope EmployedNode provideEmployedNode() {
        return owner.getParent();
    }

    @Provides @Named("OccupationNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OccupationNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OccupationNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OccupationNode> provideTypeRuleProvider(OccupationNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("OccupationNodeRuleProvider") @IntoMap @StringKey("occupationNode")
        RuleProvider<OccupationNode> provideOccupationNodeChildRuleProvider(
            EmployedNodeChildProvider.OccupationNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<OccupationNode>> provideRuleProviders(
        @Named("OccupationNodeRuleProvider")  Map<String, Provider<RuleProvider<OccupationNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}