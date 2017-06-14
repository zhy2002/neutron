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
public class RealEstateNodeModule {

    private final RealEstateNode owner;

    public RealEstateNodeModule(RealEstateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RealEstateNode provideRealEstateNode() {
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

    @Provides @ComponentScope RealEstateListNode provideRealEstateListNode() {
        return owner.getParent();
    }

    @Provides @Named("RealEstateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RealEstateNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RealEstateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RealEstateNode> provideTypeRuleProvider(RealEstateNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<RealEstateNode>> provideRuleProviders(
        @Named("RealEstateNodeRuleProvider")  Map<String, Provider<RuleProvider<RealEstateNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}