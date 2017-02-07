package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@CreditCardNodeChildScope
public class CreditCardNodeChildModule {


    @Provides
    @CreditCardNodeChildScope
    @Named("creditCardTypeNode")
    CreditCardTypeNode provideCreditCardTypeNode(
        CreditCardNode parent,
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
        CreditCardNode parent,
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
        CreditCardNode parent,
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
        CreditCardNode parent,
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
        CreditCardNode parent,
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
        CreditCardNode parent,
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
        CreditCardNode parent,
        MembersInjector<CreditCardLenderNameNode> injector
    ) {
        CreditCardLenderNameNode node = new CreditCardLenderNameNode(parent, "creditCardLenderNameNode");

        injector.injectMembers(node);
        return node;
    }

}