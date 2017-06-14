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
public class DateOfBirthNodeModule {

    private final DateOfBirthNode owner;

    public DateOfBirthNodeModule(DateOfBirthNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner DateOfBirthNode provideDateOfBirthNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner DobNode<?> provideDobNode() {
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

    @Provides @Named("DateOfBirthNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<DateOfBirthNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("DateOfBirthNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<DateOfBirthNode> provideTypeRuleProvider(DateOfBirthNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<DateOfBirthNode>> provideRuleProviders(
        @Named("DateOfBirthNodeRuleProvider")  Map<String, Provider<RuleProvider<DateOfBirthNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}