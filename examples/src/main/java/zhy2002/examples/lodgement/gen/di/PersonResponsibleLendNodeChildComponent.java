package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonResponsibleLendNodeChildScope
@Subcomponent(modules = {PersonResponsibleLendNodeChildModule.class})
public interface PersonResponsibleLendNodeChildComponent {

    PersonTypeOfChangeNode providePersonTypeOfChangeNode(@Named("personTypeOfChangeNode") PersonTypeOfChangeNode impl);
    PersonMitigationMethodNode providePersonMitigationMethodNode(@Named("personMitigationMethodNode") PersonMitigationMethodNode impl);
    PersonSignificantChangeFlagNode providePersonSignificantChangeFlagNode(@Named("personSignificantChangeFlagNode") PersonSignificantChangeFlagNode impl);
    PersonRepaymentDifficultyNode providePersonRepaymentDifficultyNode(@Named("personRepaymentDifficultyNode") PersonRepaymentDifficultyNode impl);

}
