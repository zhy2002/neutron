package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@RetiredEmploymentNodeChildScope
@Subcomponent(modules = {RetiredEmploymentNodeChildModule.class})
public interface RetiredEmploymentNodeChildComponent {

    RetiredOnBenefitFlagNode provideRetiredOnBenefitFlagNode(@Named("retiredOnBenefitFlagNode") RetiredOnBenefitFlagNode impl);
    RetiredSinceNode provideRetiredSinceNode(@Named("retiredSinceNode") RetiredSinceNode impl);

}
