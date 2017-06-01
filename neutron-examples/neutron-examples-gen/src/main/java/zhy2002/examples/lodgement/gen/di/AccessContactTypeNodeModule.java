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
public class AccessContactTypeNodeModule {

    private final AccessContactTypeNode owner;

    public AccessContactTypeNodeModule(AccessContactTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessContactTypeNode provideAccessContactTypeNode() {
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

    @Provides @ComponentScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @Named("AccessContactTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AccessContactTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AccessContactTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AccessContactTypeNode> provideTypeRuleProvider(AccessContactTypeNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("AccessContactTypeNodeRuleProvider") @IntoMap @StringKey("accessContactTypeNode")
        RuleProvider<AccessContactTypeNode> provideAccessContactTypeNodeChildRuleProvider(
            AccessNodeChildProvider.AccessContactTypeNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<AccessContactTypeNode>> provideRuleProviders(
        @Named("AccessContactTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<AccessContactTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}