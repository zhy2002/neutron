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
public class AccessContactFirstNameNodeModule {

    private final AccessContactFirstNameNode owner;

    public AccessContactFirstNameNodeModule(AccessContactFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessContactFirstNameNode provideAccessContactFirstNameNode() {
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

    @Provides @Named("AccessContactFirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AccessContactFirstNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AccessContactFirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AccessContactFirstNameNode> provideTypeRuleProvider(AccessContactFirstNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AccessContactFirstNameNode>> provideRuleProviders(
        @Named("AccessContactFirstNameNodeRuleProvider")  Map<String, Provider<RuleProvider<AccessContactFirstNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}