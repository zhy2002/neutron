package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class StudentFlagNodeModule {

    private final StudentFlagNode owner;

    public StudentFlagNodeModule(StudentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @StudentFlagNodeScope @Owner StudentFlagNode provideStudentFlagNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @StudentFlagNodeScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @StudentFlagNodeScope
    RuleProvider<StudentFlagNode> provideRuleProvider(Provider<StudentFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @StudentFlagNodeScope
    Map<String, RuleProvider<StudentFlagNode>> provideInstanceProviderMap(
        Provider<UnemployedNodeChildProvider.StudentFlagNodeRuleProvider> studentFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<StudentFlagNode>> result = new HashMap<>();
        result.put("studentFlagNode", studentFlagNodeRuleProvider.get());
        return result;
    }
}