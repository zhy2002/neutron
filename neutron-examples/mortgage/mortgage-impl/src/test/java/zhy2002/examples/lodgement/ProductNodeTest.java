package zhy2002.examples.lodgement;

import org.junit.Before;
import org.junit.Test;
import zhy2002.examples.interop.JavaMethods;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.test.TestUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class ProductNodeTest {

    private ApplicationNode applicationNode;
    private ProductsNode productsNode;

    @Before
    public void setup() {
        applicationNode = JavaMethods.createApplicationNode(TestUtil.BANK_B, null);
        productsNode = applicationNode.getProductsNode();
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

    @Test
    public void disabledAncestorCountIsSetCorrectly() {
        ProductListNode productListNode = applicationNode.getProductsNode().getProductListNode();
        ProductNode productNode = productListNode.createItem();
        ProductFeaturesNode productFeaturesNode = productNode.getProductFeaturesNode();
        assertThat(productFeaturesNode.isEffectivelyDisabled(), equalTo(true));
        assertThat(productFeaturesNode.getDisabledAncestorCount(), equalTo(0));
        assertThat(productFeaturesNode.getProductPackageNameNode().getDisabledAncestorCount(), equalTo(1));

        ProductCardHolderNode productCardHolderNode = productFeaturesNode.getProductPrimaryCardHolderNode();
        assertThat(productCardHolderNode.isDisabled(), equalTo(true));
        assertThat(productCardHolderNode.getProductCardHolderNameNode().getDisabledAncestorCount(), equalTo(2));

        ProductDescriptionNode productDescriptionNode = productNode.getProductDescriptionNode();
        productDescriptionNode.getProductGroupNode().setValue("Homeplus");
        productDescriptionNode.getProductNameNode().setValue("Homeplus, Variable Rate");

        assertThat(productFeaturesNode.getProductPackageNameNode().getDisabledAncestorCount(), equalTo(0));
        assertThat(productCardHolderNode.getProductCardHolderNameNode().getDisabledAncestorCount(), equalTo(1));

        productFeaturesNode.getProductCreditCardFlagNode().setValue(Boolean.TRUE);
        assertThat(productCardHolderNode.isDisabled(), equalTo(false));
        assertThat(productCardHolderNode.getProductCardHolderNameNode().getDisabledAncestorCount(), equalTo(0));

    }

}
