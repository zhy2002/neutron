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
public class PreviousEmploymentListNodeModule {

    private final PreviousEmploymentListNode owner;

    public PreviousEmploymentListNodeModule(PreviousEmploymentListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PreviousEmploymentListNode providePreviousEmploymentListNode() {
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

    @Provides @Named("PreviousEmploymentListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PreviousEmploymentListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PreviousEmploymentListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PreviousEmploymentListNode> provideTypeRuleProvider(PreviousEmploymentListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PreviousEmploymentListNode>> provideRuleProviders(
        @Named("PreviousEmploymentListNodeRuleProvider")  Map<String, Provider<RuleProvider<PreviousEmploymentListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}