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
public class ErrorNodeModule {

    private final ErrorNode owner;

    public ErrorNodeModule(ErrorNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ErrorNode provideErrorNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ValidationErrorUiNode<?> provideValidationErrorUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ErrorListNode provideErrorListNode() {
        return owner.getParent();
    }

    @Provides @Named("ErrorNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ErrorNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ErrorNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ErrorNode> provideTypeRuleProvider(ErrorNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ErrorNode>> provideRuleProviders(
        @Named("ErrorNodeRuleProvider")  Map<String, Provider<RuleProvider<ErrorNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}