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
public class OtherIncomeNodeModule {

    private final OtherIncomeNode owner;

    public OtherIncomeNodeModule(OtherIncomeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeNode provideOtherIncomeNode() {
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

    @Provides @ComponentScope BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherIncomeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherIncomeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherIncomeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherIncomeNode> provideTypeRuleProvider(OtherIncomeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherIncomeNode>> provideRuleProviders(
        @Named("OtherIncomeNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherIncomeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}