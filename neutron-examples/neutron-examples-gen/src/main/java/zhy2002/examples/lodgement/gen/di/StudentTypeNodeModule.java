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

    @Provides @ComponentScope
    RuleProvider<StudentTypeNode> provideRuleProvider(Provider<StudentTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<StudentTypeNode>> provideInstanceProviderMap(
        Provider<UnemployedNodeChildProvider.StudentTypeNodeRuleProvider> studentTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<StudentTypeNode>> result = new HashMap<>();
        result.put("studentTypeNode", studentTypeNodeRuleProvider.get());
        return result;
    }
}