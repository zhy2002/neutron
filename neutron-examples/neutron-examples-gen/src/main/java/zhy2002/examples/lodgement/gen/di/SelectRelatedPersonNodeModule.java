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
public class SelectRelatedPersonNodeModule {

    private final SelectRelatedPersonNode owner;

    public SelectRelatedPersonNodeModule(SelectRelatedPersonNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonNode provideSelectRelatedPersonNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner.getParent();
    }

    @Provides @Named("SelectRelatedPersonNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SelectRelatedPersonNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SelectRelatedPersonNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SelectRelatedPersonNode> provideTypeRuleProvider(SelectRelatedPersonNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SelectRelatedPersonNode>> provideRuleProviders(
        @Named("SelectRelatedPersonNodeRuleProvider")  Map<String, Provider<RuleProvider<SelectRelatedPersonNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}