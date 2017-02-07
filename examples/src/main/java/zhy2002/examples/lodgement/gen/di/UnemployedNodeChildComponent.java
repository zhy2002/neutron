package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@UnemployedNodeChildScope
@Subcomponent(modules = {UnemployedNodeChildModule.class})
public interface UnemployedNodeChildComponent {

    UnemployedOnBenefitFlagNode provideUnemployedOnBenefitFlagNode(@Named("unemployedOnBenefitFlagNode") UnemployedOnBenefitFlagNode impl);
    StudentFlagNode provideStudentFlagNode(@Named("studentFlagNode") StudentFlagNode impl);
    StudentTypeNode provideStudentTypeNode(@Named("studentTypeNode") StudentTypeNode impl);
    HouseDutiesFlagNode provideHouseDutiesFlagNode(@Named("houseDutiesFlagNode") HouseDutiesFlagNode impl);
    UnemployedSinceNode provideUnemployedSinceNode(@Named("unemployedSinceNode") UnemployedSinceNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setUnemployedNodeChildModule(UnemployedNodeChildModule module);

        UnemployedNodeChildComponent build();
    }
}
