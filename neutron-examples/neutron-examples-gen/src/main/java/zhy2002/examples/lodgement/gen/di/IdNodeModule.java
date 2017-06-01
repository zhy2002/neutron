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
public class IdNodeModule {

    private final IdNode owner;

    public IdNodeModule(IdNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner IdNode provideIdNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @Named("IdNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<IdNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("IdNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<IdNode> provideTypeRuleProvider(IdNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("IdNodeRuleProvider") @IntoMap @StringKey("idNode")
        RuleProvider<IdNode> provideIdNodeChildRuleProvider(
            ApplicationNodeChildProvider.IdNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<IdNode>> provideRuleProviders(
        @Named("IdNodeRuleProvider")  Map<String, Provider<RuleProvider<IdNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}