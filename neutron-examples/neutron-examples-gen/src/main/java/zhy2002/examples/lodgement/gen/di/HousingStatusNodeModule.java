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
public class HousingStatusNodeModule {

    private final HousingStatusNode owner;

    public HousingStatusNodeModule(HousingStatusNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner HousingStatusNode provideHousingStatusNode() {
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

    @Provides @ComponentScope PersonGeneralNode providePersonGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("HousingStatusNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<HousingStatusNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("HousingStatusNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<HousingStatusNode> provideTypeRuleProvider(HousingStatusNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<HousingStatusNode>> provideRuleProviders(
        @Named("HousingStatusNodeRuleProvider")  Map<String, Provider<RuleProvider<HousingStatusNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}