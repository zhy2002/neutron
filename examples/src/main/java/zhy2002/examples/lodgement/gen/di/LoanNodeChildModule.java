package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@LoanNodeChildScope
public class LoanNodeChildModule {

    private final LoanNode parent;

    public LoanNodeChildModule(LoanNode parent) {
        this.parent = parent;
    }


    @Provides
    @LoanNodeChildScope
    @Named("loanTypeNode")
    LoanTypeNode provideLoanTypeNode(
        MembersInjector<LoanTypeNode> injector
    ) {
        LoanTypeNode node = new LoanTypeNode(parent, "loanTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LoanNodeChildScope
    @Named("loanLenderNameNode")
    LoanLenderNameNode provideLoanLenderNameNode(
        MembersInjector<LoanLenderNameNode> injector
    ) {
        LoanLenderNameNode node = new LoanLenderNameNode(parent, "loanLenderNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LoanNodeChildScope
    @Named("loanLimitAmountNode")
    LoanLimitAmountNode provideLoanLimitAmountNode(
        MembersInjector<LoanLimitAmountNode> injector
    ) {
        LoanLimitAmountNode node = new LoanLimitAmountNode(parent, "loanLimitAmountNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LoanNodeChildScope
    @Named("loanOwingAmountNode")
    LoanOwingAmountNode provideLoanOwingAmountNode(
        MembersInjector<LoanOwingAmountNode> injector
    ) {
        LoanOwingAmountNode node = new LoanOwingAmountNode(parent, "loanOwingAmountNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LoanNodeChildScope
    @Named("loanMonthlyRepaymentNode")
    LoanMonthlyRepaymentNode provideLoanMonthlyRepaymentNode(
        MembersInjector<LoanMonthlyRepaymentNode> injector
    ) {
        LoanMonthlyRepaymentNode node = new LoanMonthlyRepaymentNode(parent, "loanMonthlyRepaymentNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LoanNodeChildScope
    @Named("loanClearingFlagNode")
    LoanClearingFlagNode provideLoanClearingFlagNode(
        MembersInjector<LoanClearingFlagNode> injector
    ) {
        LoanClearingFlagNode node = new LoanClearingFlagNode(parent, "loanClearingFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @LoanNodeChildScope
    @Named("loanBreakCostNode")
    LoanBreakCostNode provideLoanBreakCostNode(
        MembersInjector<LoanBreakCostNode> injector
    ) {
        LoanBreakCostNode node = new LoanBreakCostNode(parent, "loanBreakCostNode");

        injector.injectMembers(node);
        return node;
    }

}