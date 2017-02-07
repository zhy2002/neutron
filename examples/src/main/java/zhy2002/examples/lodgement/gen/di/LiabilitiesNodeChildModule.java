package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    CreditCardListNodeItemComponent.class,
    LoanListNodeItemComponent.class,
    OtherLiabilityListNodeItemComponent.class
})
@LiabilitiesNodeChildScope
public class LiabilitiesNodeChildModule {

    private final LiabilitiesNode parent;

    public LiabilitiesNodeChildModule(LiabilitiesNode parent) {
        this.parent = parent;
    }


    @Provides
    @LiabilitiesNodeChildScope
    @Named("creditCardListNode")
    CreditCardListNode provideCreditCardListNode(
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
        MembersInjector<OtherLiabilityListNode> injector
    ) {
        OtherLiabilityListNode node = new OtherLiabilityListNode(parent, "otherLiabilityListNode");

        injector.injectMembers(node);
        return node;
    }

}