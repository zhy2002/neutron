package zhy2002.mortgage.application.bankb.di;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import zhy2002.mortgage.application.gen.node.*;
import zhy2002.mortgage.application.gen.rule.ChangeFocusErrorRule;
import zhy2002.mortgage.application.gen.rule.ShowErrorListRule;
import zhy2002.mortgage.application.rule.ChangeFocusErrorRuleImpl;
import zhy2002.mortgage.application.rule.ShowErrorListRuleImpl;
import zhy2002.neutron.core.RuleCreator;
import zhy2002.neutron.core.RuleProvider;

import javax.inject.Named;

/**
 * Provide overrides and implementations for CBA profile.
 */
@Module
abstract class CustomBankBProfileModule {

    @Binds
    abstract RuleCreator provideRuleCreator(BankBRuleCreator impl);

    @Binds
    abstract ChangeFocusErrorRule provideChangeFocusErrorRule(ChangeFocusErrorRuleImpl impl);

    @Binds
    abstract ShowErrorListRule provideShowErrorListRule(ShowErrorListRuleImpl impl);

    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(LegalActionNodeRuleProviderImpl impl);

    @Binds
    @Named("ProductPackageNameNodeRuleProvider")
    @IntoMap
    @StringKey("productPackageNameNode-test")
    abstract RuleProvider<ProductPackageNameNode> provideProductPackageNameNodeTestRuleProvider(
            ProductPackageNameNodeTestRuleProvider impl
    );

    @Binds
    @Named("ProductRewardsProgramNodeRuleProvider")
    @IntoMap
    @StringKey("productRewardsProgramNode-test")
    abstract RuleProvider<ProductRewardsProgramNode> provideProductRewardsProgramNodeTestRuleProvider(
            ProductRewardsProgramNodeTestRuleProvider impl
    );

    @Binds
    @Named("ProductCreditCardTypeNodeRuleProvider")
    @IntoMap
    @StringKey("productCreditCardTypeNode-test")
    abstract RuleProvider<ProductCreditCardTypeNode> provideProductCreditCardTypeNodeTestRuleProvider(
            ProductCreditCardTypeNodeTestRuleProvider impl
    );

    @Binds
    @Named("ContractPriceNodeRuleProvider")
    @IntoMap
    @StringKey("contractPriceNode-test")
    abstract RuleProvider<ContractPriceNode> provideContractPriceNodeTestRuleProvider(
            ContractPriceNodeTestRuleProvider impl
    );

    @Binds
    @Named("OtherIncomeTypeNodeRuleProvider")
    @IntoMap
    @StringKey("otherIncomeTypeNode-test")
    abstract RuleProvider<OtherIncomeTypeNode> provideOtherIncomeTypeNodeTestRuleProvider(
            OtherIncomeTypeNodeTestRuleProvider impl
    );

    @Binds
    @Named("BrokerCompanyNodeRuleProvider")
    @IntoMap
    @StringKey("brokerCompanyNode-test")
    abstract RuleProvider<BrokerCompanyNode> provideBrokerCompanyNodeTestRuleProvider(
            BrokerCompanyNodeTestRuleProvider impl
    );
}



