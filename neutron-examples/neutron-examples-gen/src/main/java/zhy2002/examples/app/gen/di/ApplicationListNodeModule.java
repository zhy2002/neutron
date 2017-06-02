package zhy2002.examples.app.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class ApplicationListNodeModule {

    private final ApplicationListNode owner;

    public ApplicationListNodeModule(ApplicationListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ApplicationListNode provideApplicationListNode() {
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

    @Provides @ComponentScope AppManagerNode provideAppManagerNode() {
        return owner.getParent();
    }

    @Provides @Named("ApplicationListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ApplicationListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ApplicationListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ApplicationListNode> provideTypeRuleProvider(ApplicationListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ApplicationListNode>> provideRuleProviders(
        @Named("ApplicationListNodeRuleProvider")  Map<String, Provider<RuleProvider<ApplicationListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}