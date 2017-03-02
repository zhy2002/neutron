package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@StudentFlagNodeScope
@Subcomponent(modules = {StudentFlagNodeModule.class})
public interface StudentFlagNodeComponent {

    StudentFlagNodeRuleProvider getStudentFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setStudentFlagNodeModule(StudentFlagNodeModule module);

        StudentFlagNodeComponent build();
    }
}
