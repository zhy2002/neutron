package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@CreditCardNodeChildScope
public class CreditCardNodeChildModule {

    private final CreditCardNode parent;

    public CreditCardNodeChildModule(CreditCardNode parent) {
        this.parent = parent;
    }


    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardTypeNode")
    CreditCardTypeNode provideCreditCardTypeNode(
        MembersInjector<CreditCardTypeNode> injector
    ) {
        CreditCardTypeNode node = new CreditCardTypeNode(parent, "creditCardTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardAmountOwingNode")
    CreditCardAmountOwingNode provideCreditCardAmountOwingNode(
        MembersInjector<CreditCardAmountOwingNode> injector
    ) {
        CreditCardAmountOwingNode node = new CreditCardAmountOwingNode(parent, "creditCardAmountOwingNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardLimitAmount")
    CreditCardLimitAmount provideCreditCardLimitAmount(
        MembersInjector<CreditCardLimitAmount> injector
    ) {
        CreditCardLimitAmount node = new CreditCardLimitAmount(parent, "creditCardLimitAmount");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardMonthlyRepayment")
    CreditCardMonthlyRepayment provideCreditCardMonthlyRepayment(
        MembersInjector<CreditCardMonthlyRepayment> injector
    ) {
        CreditCardMonthlyRepayment node = new CreditCardMonthlyRepayment(parent, "creditCardMonthlyRepayment");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardClearingFlagNode")
    CreditCardClearingFlagNode provideCreditCardClearingFlagNode(
        MembersInjector<CreditCardClearingFlagNode> injector
    ) {
        CreditCardClearingFlagNode node = new CreditCardClearingFlagNode(parent, "creditCardClearingFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardBreakCostNode")
    CreditCardBreakCostNode provideCreditCardBreakCostNode(
        MembersInjector<CreditCardBreakCostNode> injector
    ) {
        CreditCardBreakCostNode node = new CreditCardBreakCostNode(parent, "creditCardBreakCostNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardLenderNameNode")
    CreditCardLenderNameNode provideCreditCardLenderNameNode(
        MembersInjector<CreditCardLenderNameNode> injector
    ) {
        CreditCardLenderNameNode node = new CreditCardLenderNameNode(parent, "creditCardLenderNameNode");

        injector.injectMembers(node);
        return node;
    }

}