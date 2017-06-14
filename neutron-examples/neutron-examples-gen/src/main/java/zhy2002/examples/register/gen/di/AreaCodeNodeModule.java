package zhy2002.examples.register.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class AreaCodeNodeModule {

    private final AreaCodeNode owner;

    public AreaCodeNodeModule(AreaCodeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AreaCodeNode provideAreaCodeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner PhoneInfoFieldNode providePhoneInfoFieldNode() {
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

    @Provides @ComponentScope PhoneInfoNode providePhoneInfoNode() {
        return owner.getParent();
    }

    @Provides @Named("AreaCodeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AreaCodeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AreaCodeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AreaCodeNode> provideTypeRuleProvider(AreaCodeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AreaCodeNode>> provideRuleProviders(
        @Named("AreaCodeNodeRuleProvider")  Map<String, Provider<RuleProvider<AreaCodeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}