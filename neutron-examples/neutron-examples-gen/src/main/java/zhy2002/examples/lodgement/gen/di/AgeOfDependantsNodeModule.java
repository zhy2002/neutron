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
public class AgeOfDependantsNodeModule {

    private final AgeOfDependantsNode owner;

    public AgeOfDependantsNodeModule(AgeOfDependantsNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AgeOfDependantsNode provideAgeOfDependantsNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("AgeOfDependantsNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AgeOfDependantsNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AgeOfDependantsNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AgeOfDependantsNode> provideTypeRuleProvider(AgeOfDependantsNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<AgeOfDependantsNode>> provideRuleProviders(
        @Named("AgeOfDependantsNodeRuleProvider")  Map<String, Provider<RuleProvider<AgeOfDependantsNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}