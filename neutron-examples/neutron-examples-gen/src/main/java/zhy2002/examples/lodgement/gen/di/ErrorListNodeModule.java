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
public class ErrorListNodeModule {

    private final ErrorListNode owner;

    public ErrorListNodeModule(ErrorListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ErrorListNode provideErrorListNode() {
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

    @Provides @Named("ErrorListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ErrorListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ErrorListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ErrorListNode> provideTypeRuleProvider(ErrorListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ErrorListNodeRuleProvider") @IntoMap @StringKey("errorListNode")
        RuleProvider<ErrorListNode> provideErrorListNodeChildRuleProvider(
            ApplicationNodeChildProvider.ErrorListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ErrorListNode>> provideRuleProviders(
        @Named("ErrorListNodeRuleProvider")  Map<String, Provider<RuleProvider<ErrorListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}