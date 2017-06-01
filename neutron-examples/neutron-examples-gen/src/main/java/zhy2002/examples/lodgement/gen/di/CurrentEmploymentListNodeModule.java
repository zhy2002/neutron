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
public class CurrentEmploymentListNodeModule {

    private final CurrentEmploymentListNode owner;

    public CurrentEmploymentListNodeModule(CurrentEmploymentListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CurrentEmploymentListNode provideCurrentEmploymentListNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @Named("CurrentEmploymentListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CurrentEmploymentListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CurrentEmploymentListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CurrentEmploymentListNode> provideTypeRuleProvider(CurrentEmploymentListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CurrentEmploymentListNodeRuleProvider") @IntoMap @StringKey("currentEmploymentListNode")
        RuleProvider<CurrentEmploymentListNode> provideCurrentEmploymentListNodeChildRuleProvider(
            PersonNodeChildProvider.CurrentEmploymentListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CurrentEmploymentListNode>> provideRuleProviders(
        @Named("CurrentEmploymentListNodeRuleProvider")  Map<String, Provider<RuleProvider<CurrentEmploymentListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}