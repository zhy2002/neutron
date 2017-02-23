package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PrimaryApplicantFlagNodeScope
@Subcomponent(modules = {PrimaryApplicantFlagNodeModule.class})
public interface PrimaryApplicantFlagNodeComponent {

    PrimaryApplicantFlagNodeRuleProvider getPrimaryApplicantFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPrimaryApplicantFlagNodeModule(PrimaryApplicantFlagNodeModule module);

        PrimaryApplicantFlagNodeComponent build();
    }
}
