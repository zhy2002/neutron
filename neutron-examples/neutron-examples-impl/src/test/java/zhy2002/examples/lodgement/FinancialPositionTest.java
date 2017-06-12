package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.TestUtil;
import zhy2002.examples.interop.JavaMethods;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

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

    @Test
    public void onlyProductGroupIsEnabledOnCreation() {
        ProductListNode productListNode = applicationNode.getProductsNode().getProductListNode();
        ProductNode productNode = productListNode.createItem();
        ProductDescriptionNode productDescriptionNode = productNode.getProductDescriptionNode();
        assertThat(productDescriptionNode.getProductGroupNode().isEffectivelyDisabled(), equalTo(false));
        assertThat(productDescriptionNode.getProductNameNode().isEffectivelyDisabled(), equalTo(true));
        assertThat(productDescriptionNode.getProductRequestedAmountNode().isEffectivelyDisabled(), equalTo(true));
        assertThat(productDescriptionNode.getProductLendingPurposeNode().isEffectivelyDisabled(), equalTo(true));

        productDescriptionNode.getProductGroupNode().setValue("Homeplus");
        assertThat(productDescriptionNode.getProductGroupNode().isEffectivelyDisabled(), equalTo(false));
        assertThat(productDescriptionNode.getProductNameNode().isEffectivelyDisabled(), equalTo(false));
        assertThat(productDescriptionNode.getProductRequestedAmountNode().isEffectivelyDisabled(), equalTo(true));
        assertThat(productDescriptionNode.getProductLendingPurposeNode().isEffectivelyDisabled(), equalTo(true));

        productDescriptionNode.getProductNameNode().setValue("Homeplus, Variable Rate");
        assertThat(productDescriptionNode.getProductNameNode().getValue(), equalTo("Homeplus, Variable Rate"));

        productDescriptionNode.getProductGroupNode().setValue("BaseVariable");
        assertThat(productDescriptionNode.getProductNameNode().isEffectivelyDisabled(), equalTo(false));
        assertThat(productDescriptionNode.getProductNameNode().getValue(), equalTo(""));

    }

    @Test
    public void productNameValueIsClearedWhenProductGroupIsChanged() {
        ProductListNode productListNode = applicationNode.getProductsNode().getProductListNode();
        ProductNode productNode = productListNode.createItem();
        ProductDescriptionNode productDescriptionNode = productNode.getProductDescriptionNode();

        productDescriptionNode.getProductGroupNode().setValue("Homeplus");
        productDescriptionNode.getProductNameNode().setValue("Homeplus, Variable Rate");
        assertThat(productDescriptionNode.getProductNameNode().getValue(), equalTo("Homeplus, Variable Rate"));

        productDescriptionNode.getProductGroupNode().setValue("BaseVariable");
        assertThat(productDescriptionNode.getProductNameNode().getValue(), equalTo(""));
    }

    @Test
    public void clearingValueDoesNotTriggerRequiredValidation() {
        ProductListNode productListNode = applicationNode.getProductsNode().getProductListNode();
        ProductNode productNode = productListNode.createItem();
        ProductDescriptionNode productDescriptionNode = productNode.getProductDescriptionNode();
        ProductGroupNode productGroupNode = productDescriptionNode.getProductGroupNode();
        assertThat(
                TestUtil.hasError(productGroupNode.getValidationErrorList(), LeafValueRequiredValidationRule.class),
                equalTo(false)
        );

        productGroupNode.setValue("Homeplus");
        assertThat(
                TestUtil.hasError(productGroupNode.getValidationErrorList(), LeafValueRequiredValidationRule.class),
                equalTo(false)
        );

        productGroupNode.resetValue();
        assertThat(
                TestUtil.hasError(productGroupNode.getValidationErrorList(), LeafValueRequiredValidationRule.class),
                equalTo(false)
        );
    }

    @Test
    public void productAccountHolderListIsEnabledWhenProductNameIsSet() {
        ProductListNode productListNode = applicationNode.getProductsNode().getProductListNode();
        ProductNode productNode = productListNode.createItem();
        ProductDescriptionNode productDescriptionNode = productNode.getProductDescriptionNode();
        ProductAccountHolderListNode accountHolderListNode = productDescriptionNode.getProductAccountHolderListNode();
        assertThat(accountHolderListNode.isEffectivelyDisabled(), equalTo(true));
        assertThat(accountHolderListNode.getItemCount(), equalTo(0));

        PersonNode personNode = applicationNode.getPersonListNode().createItem();
        assertThat(accountHolderListNode.getItemCount(), equalTo(1));
        SelectAccountHolderNode selectAccountHolderNode = accountHolderListNode.getItem(0);
        assertThat(selectAccountHolderNode.isEffectivelyDisabled(), equalTo(true));

        productDescriptionNode.getProductGroupNode().setValue("Homeplus");
        productDescriptionNode.getProductNameNode().setValue("Homeplus, Variable Rate");
        assertThat(accountHolderListNode.isEffectivelyDisabled(), equalTo(false));
        assertThat(selectAccountHolderNode.isEffectivelyDisabled(), equalTo(false));

        selectAccountHolderNode.getSelectAccountHolderFlagNode().setValue(true);
        productDescriptionNode.getProductGroupNode().resetValue();
        assertThat(selectAccountHolderNode.getSelectAccountHolderFlagNode().getValue(), equalTo(false));
    }

    @Test
    public void shouldEnableProductNameWhenProductGroupIsSet() {
        ProductListNode productListNode = applicationNode.getProductsNode().getProductListNode();
        ProductNode productNode = productListNode.createItem();
        ProductDescriptionNode productDescriptionNode = productNode.getProductDescriptionNode();
        productDescriptionNode.getProductGroupNode().setValue("Homeplus");
        assertThat(productDescriptionNode.getProductNameNode().isEffectivelyDisabled(), equalTo(false));

        productDescriptionNode.getProductNameNode().setValue("Homeplus, Variable Rate");
        productDescriptionNode.getProductGroupNode().resetValue();
        assertThat(productDescriptionNode.getProductNameNode().isEffectivelyDisabled(), equalTo(true));

        productDescriptionNode.getProductGroupNode().setValue("Homeplus");
        assertThat(productDescriptionNode.getProductNameNode().isEffectivelyDisabled(), equalTo(false));

    }


}
