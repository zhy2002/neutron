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
public class RealEstateListNodeModule {

    private final RealEstateListNode owner;

    public RealEstateListNodeModule(RealEstateListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RealEstateListNode provideRealEstateListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @Named("RealEstateListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RealEstateListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RealEstateListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RealEstateListNode> provideTypeRuleProvider(RealEstateListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("RealEstateListNodeRuleProvider") @IntoMap @StringKey("realEstateListNode")
        RuleProvider<RealEstateListNode> provideRealEstateListNodeChildRuleProvider(
            ApplicationNodeChildProvider.RealEstateListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<RealEstateListNode>> provideRuleProviders(
        @Named("RealEstateListNodeRuleProvider")  Map<String, Provider<RuleProvider<RealEstateListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}