package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {StudentFlagNodeModule.class})
public interface StudentFlagNodeComponent {

    RuleProvider<StudentFlagNode> getStudentFlagNodeRuleProvider();
    Map<String, RuleProvider<StudentFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setStudentFlagNodeModule(StudentFlagNodeModule module);

        StudentFlagNodeComponent build();
    }
}
