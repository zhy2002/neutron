package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@LiabilitiesNodeChildScope
@Subcomponent(modules = {LiabilitiesNodeChildModule.class})
public interface LiabilitiesNodeChildComponent {

    CreditCardListNode provideCreditCardListNode(@Named("creditCardListNode") CreditCardListNode impl);
    LoanListNode provideLoanListNode(@Named("loanListNode") LoanListNode impl);
    OtherLiabilityListNode provideOtherLiabilityListNode(@Named("otherLiabilityListNode") OtherLiabilityListNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setLiabilitiesNodeChildModule(LiabilitiesNodeChildModule module);

        LiabilitiesNodeChildComponent build();
    }
}
