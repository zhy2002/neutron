package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {StudentTypeNodeModule.class})
public interface StudentTypeNodeComponent {

    List<RuleProvider<StudentTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setStudentTypeNodeModule(StudentTypeNodeModule module);

        StudentTypeNodeComponent build();
    }

}
