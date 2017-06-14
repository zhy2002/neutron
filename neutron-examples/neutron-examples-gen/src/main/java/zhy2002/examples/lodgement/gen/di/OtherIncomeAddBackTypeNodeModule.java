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
public class OtherIncomeAddBackTypeNodeModule {

    private final OtherIncomeAddBackTypeNode owner;

    public OtherIncomeAddBackTypeNodeModule(OtherIncomeAddBackTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeAddBackTypeNode provideOtherIncomeAddBackTypeNode() {
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

    @Provides @ComponentScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherIncomeAddBackTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherIncomeAddBackTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherIncomeAddBackTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherIncomeAddBackTypeNode> provideTypeRuleProvider(OtherIncomeAddBackTypeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherIncomeAddBackTypeNode>> provideRuleProviders(
        @Named("OtherIncomeAddBackTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherIncomeAddBackTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}