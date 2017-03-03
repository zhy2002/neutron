package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ApplicantReferenceNodeScope
@Subcomponent(modules = {ApplicantReferenceNodeModule.class})
public interface ApplicantReferenceNodeComponent {

    ApplicantReferenceNodeRuleProvider getApplicantReferenceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setApplicantReferenceNodeModule(ApplicantReferenceNodeModule module);

        ApplicantReferenceNodeComponent build();
    }
}
