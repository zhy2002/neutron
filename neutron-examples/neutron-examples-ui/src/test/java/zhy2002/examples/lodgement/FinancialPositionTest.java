package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.lodgement.di.ApplicationNodeFactory;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.FinancialPositionNode;
import zhy2002.examples.lodgement.gen.node.SavingsAccountListNode;
import zhy2002.examples.lodgement.gen.node.SavingsAccountNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FinancialPositionTest {

    private ApplicationNode applicationNode;
    private FinancialPositionNode financialPositionNode;

    @Before
    public void setup() {
        applicationNode = ApplicationNodeFactory.create();
        financialPositionNode = applicationNode.getFinancialPositionNode();
    }

    @Test
    public void canSuccessfullySetSavingsBalance() {
        assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));

        SavingsAccountListNode accountListNode = financialPositionNode.getAssetsNode().getSavingsAccountListNode();
        SavingsAccountNode savingsAccountNode = accountListNode.createItem();
        savingsAccountNode.getSavingsBalanceNode().setText("111");

        assertThat(applicationNode.getErrorListNode().getItemCount(), equalTo(0));
    }
}
