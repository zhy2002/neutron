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
public class StudentTypeNodeModule {

    private final StudentTypeNode owner;

    public StudentTypeNodeModule(StudentTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner StudentTypeNode provideStudentTypeNode() {
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

    @Provides @Named("StudentTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<StudentTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("StudentTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<StudentTypeNode> provideTypeRuleProvider(StudentTypeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<StudentTypeNode>> provideRuleProviders(
        @Named("StudentTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<StudentTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}