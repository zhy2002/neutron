package zhy2002.examples.lodgement.bankb.di;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import zhy2002.examples.lodgement.gen.node.LegalActionNodeRuleProvider;
import zhy2002.examples.lodgement.gen.node.ProductCreditCardTypeNode;
import zhy2002.examples.lodgement.gen.node.ProductPackageNameNode;
import zhy2002.examples.lodgement.gen.node.ProductRewardsProgramNode;
import zhy2002.examples.lodgement.gen.rule.ChangeFocusErrorRule;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.examples.lodgement.gen.rule.UpdateAddressRefListRule;
import zhy2002.examples.lodgement.rule.ChangeFocusErrorRuleImpl;
import zhy2002.examples.lodgement.rule.ShowErrorListRuleImpl;
import zhy2002.examples.lodgement.rule.UpdateAddressRefListRuleImpl;
import zhy2002.neutron.RuleProvider;

import javax.inject.Named;

/**
 * Provide overrides and implementations for CBA profile.
 */
@Module
abstract class CustomBankBProfileModule {

    @Binds
    abstract UpdateAddressRefListRule provideUpdateAddressRefListRule(UpdateAddressRefListRuleImpl impl);

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
}



