package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ApplicantTypeNodeScope
@Subcomponent(modules = {ApplicantTypeNodeModule.class})
public interface ApplicantTypeNodeComponent {

    ApplicantTypeNodeRuleProvider getApplicantTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicantTypeNodeModule(ApplicantTypeNodeModule module);

        ApplicantTypeNodeComponent build();
    }
}
