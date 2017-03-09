package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@StudentTypeNodeScope
@Subcomponent(modules = {StudentTypeNodeModule.class})
public interface StudentTypeNodeComponent {

    StudentTypeNodeRuleProvider getStudentTypeNodeRuleProvider();
    Map<String, RuleProvider<StudentTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setStudentTypeNodeModule(StudentTypeNodeModule module);

        StudentTypeNodeComponent build();
    }
}
