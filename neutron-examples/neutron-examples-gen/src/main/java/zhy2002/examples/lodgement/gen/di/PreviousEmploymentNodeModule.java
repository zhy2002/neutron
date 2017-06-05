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
public class PreviousEmploymentNodeModule {

    private final PreviousEmploymentNode owner;

    public PreviousEmploymentNodeModule(PreviousEmploymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PreviousEmploymentNode providePreviousEmploymentNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmploymentNode<?> provideEmploymentNode() {
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

    @Provides @ComponentScope PreviousEmploymentListNode providePreviousEmploymentListNode() {
        return owner.getParent();
    }

    @Provides @Named("PreviousEmploymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PreviousEmploymentNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PreviousEmploymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PreviousEmploymentNode> provideTypeRuleProvider(PreviousEmploymentNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PreviousEmploymentNode>> provideRuleProviders(
        @Named("PreviousEmploymentNodeRuleProvider")  Map<String, Provider<RuleProvider<PreviousEmploymentNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}