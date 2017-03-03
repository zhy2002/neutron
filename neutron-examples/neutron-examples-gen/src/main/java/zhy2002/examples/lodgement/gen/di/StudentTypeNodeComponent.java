package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@StudentTypeNodeScope
@Subcomponent(modules = {StudentTypeNodeModule.class})
public interface StudentTypeNodeComponent {

    StudentTypeNodeRuleProvider getStudentTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setStudentTypeNodeModule(StudentTypeNodeModule module);

        StudentTypeNodeComponent build();
    }
}
