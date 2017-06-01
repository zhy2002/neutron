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
public class AccessContactTitleNodeModule {

    private final AccessContactTitleNode owner;

    public AccessContactTitleNodeModule(AccessContactTitleNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessContactTitleNode provideAccessContactTitleNode() {
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

    @Provides @Named("AccessContactTitleNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AccessContactTitleNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AccessContactTitleNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AccessContactTitleNode> provideTypeRuleProvider(AccessContactTitleNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("AccessContactTitleNodeRuleProvider") @IntoMap @StringKey("accessContactTitleNode")
        RuleProvider<AccessContactTitleNode> provideAccessContactTitleNodeChildRuleProvider(
            AccessNodeChildProvider.AccessContactTitleNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<AccessContactTitleNode>> provideRuleProviders(
        @Named("AccessContactTitleNodeRuleProvider")  Map<String, Provider<RuleProvider<AccessContactTitleNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}