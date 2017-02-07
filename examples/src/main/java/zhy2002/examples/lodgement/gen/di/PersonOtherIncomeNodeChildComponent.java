package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonOtherIncomeNodeChildScope
@Subcomponent(modules = {PersonOtherIncomeNodeChildModule.class})
public interface PersonOtherIncomeNodeChildComponent {

    PersonAddBackTypeNode providePersonAddBackTypeNode(@Named("personAddBackTypeNode") PersonAddBackTypeNode impl);
    PersonOtherIncomeAmountNode providePersonOtherIncomeAmountNode(@Named("personOtherIncomeAmountNode") PersonOtherIncomeAmountNode impl);
    PersonOtherIncomeDescriptionNode providePersonOtherIncomeDescriptionNode(@Named("personOtherIncomeDescriptionNode") PersonOtherIncomeDescriptionNode impl);
    PersonOtherIncomePreviousYearNode providePersonOtherIncomePreviousYearNode(@Named("personOtherIncomePreviousYearNode") PersonOtherIncomePreviousYearNode impl);
    PersonOtherIncomeTypeNode providePersonOtherIncomeTypeNode(@Named("personOtherIncomeTypeNode") PersonOtherIncomeTypeNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonOtherIncomeNodeChildModule(PersonOtherIncomeNodeChildModule module);

        PersonOtherIncomeNodeChildComponent build();
    }
}
