package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonNodeChildScope
@Subcomponent(modules = {PersonNodeChildModule.class})
public interface PersonNodeChildComponent {

    PersonGeneralNode providePersonGeneralNode(@Named("personGeneralNode") PersonGeneralNode impl);
    PersonContactNode providePersonContactNode(@Named("personContactNode") PersonContactNode impl);
    CurrentEmploymentListNode provideCurrentEmploymentListNode(@Named("currentEmploymentListNode") CurrentEmploymentListNode impl);
    PreviousEmploymentListNode providePreviousEmploymentListNode(@Named("previousEmploymentListNode") PreviousEmploymentListNode impl);
    PersonTrustNode providePersonTrustNode(@Named("personTrustNode") PersonTrustNode impl);
    PersonPrivacyNode providePersonPrivacyNode(@Named("personPrivacyNode") PersonPrivacyNode impl);
    PersonOtherIncomeListNode providePersonOtherIncomeListNode(@Named("personOtherIncomeListNode") PersonOtherIncomeListNode impl);
    PersonResponsibleLendNode providePersonResponsibleLendNode(@Named("personResponsibleLendNode") PersonResponsibleLendNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonNodeChildModule(PersonNodeChildModule module);

        PersonNodeChildComponent build();
    }
}
