package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class StudentTypeNodeModule {

    private final StudentTypeNode owner;

    public StudentTypeNodeModule(StudentTypeNode owner) {
        this.owner = owner;
    }

    @Provides @StudentTypeNodeScope @Owner StudentTypeNode provideStudentTypeNode() {
        return owner;
    }

    @Provides @StudentTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @StudentTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @StudentTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @StudentTypeNodeScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @StudentTypeNodeScope
    RuleProvider<StudentTypeNode> provideRuleProvider(Provider<StudentTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @StudentTypeNodeScope
    Map<String, RuleProvider<StudentTypeNode>> provideInstanceProviderMap(
        Provider<UnemployedNodeChildProvider.StudentTypeNodeRuleProvider> studentTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<StudentTypeNode>> result = new HashMap<>();
        result.put("studentTypeNode", studentTypeNodeRuleProvider.get());
        return result;
    }
}