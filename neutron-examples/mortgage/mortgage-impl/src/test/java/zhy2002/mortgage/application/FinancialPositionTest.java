package zhy2002.mortgage.application;

import org.junit.Before;
import org.junit.Test;
import zhy2002.mortgage.interop.JavaMethods;
import zhy2002.mortgage.application.gen.node.*;
import zhy2002.neutron.test.TestUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FinancialPositionTest {

    private ApplicationNode applicationNode;
    private FinancialPositionNode financialPositionNode;

    @Before
    public void setup() {
        applicationNode = JavaMethods.createApplicationNode(TestUtil.BANK_B, null);
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

    @Test
    public void shouldNotValidateDisabledNode() {
        ProductCustomerContributionListNode contributionListNode = applicationNode.getProductsNode().getProductCustomerContributionListNode();
        ProductCustomerContributionNode contributionNode = contributionListNode.createItem();
        assertThat(contributionNode.getContributionDescriptionNode().getValidationErrorList().size(), equalTo(0));
        assertThat(contributionNode.getContributionDescriptionNode().isDisabled(), equalTo(true));

        contributionNode.getContributionTypeNode().setValue("Cash");
        contributionNode.getContributionAmountNode().setText("100");
        contributionNode.refresh();
        assertThat(contributionNode.getContributionDescriptionNode().isDisabled(), equalTo(true));
        assertThat(contributionNode.getContributionDescriptionNode().getValidationErrorList().size(), equalTo(0));

    }

}
