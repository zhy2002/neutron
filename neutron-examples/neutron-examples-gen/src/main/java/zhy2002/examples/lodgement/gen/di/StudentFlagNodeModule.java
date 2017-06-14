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
public class StudentFlagNodeModule {

    private final StudentFlagNode owner;

    public StudentFlagNodeModule(StudentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner StudentFlagNode provideStudentFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
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

    @Provides @ComponentScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @Named("StudentFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<StudentFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("StudentFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<StudentFlagNode> provideTypeRuleProvider(StudentFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<StudentFlagNode>> provideRuleProviders(
        @Named("StudentFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<StudentFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}