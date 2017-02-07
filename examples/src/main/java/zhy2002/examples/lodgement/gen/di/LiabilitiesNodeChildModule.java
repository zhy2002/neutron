package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@LiabilitiesNodeChildScope
public class LiabilitiesNodeChildModule {


    @Provides
    @LiabilitiesNodeChildScope
    @Named("creditCardListNode")
    CreditCardListNode provideCreditCardListNode(
        LiabilitiesNode parent,
        MembersInjector<CreditCardListNode> injector
    ) {
        CreditCardListNode node = new CreditCardListNode(parent, "creditCardListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LiabilitiesNodeChildScope
    @Named("loanListNode")
    LoanListNode provideLoanListNode(
        LiabilitiesNode parent,
        MembersInjector<LoanListNode> injector
    ) {
        LoanListNode node = new LoanListNode(parent, "loanListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LiabilitiesNodeChildScope
    @Named("otherLiabilityListNode")
    OtherLiabilityListNode provideOtherLiabilityListNode(
        LiabilitiesNode parent,
        MembersInjector<OtherLiabilityListNode> injector
    ) {
        OtherLiabilityListNode node = new OtherLiabilityListNode(parent, "otherLiabilityListNode");

        injector.injectMembers(node);
        return node;
    }

}