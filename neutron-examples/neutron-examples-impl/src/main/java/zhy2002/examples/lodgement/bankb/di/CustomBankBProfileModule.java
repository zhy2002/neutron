package zhy2002.examples.lodgement.bankb.di;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import zhy2002.examples.lodgement.gen.node.LegalActionNodeRuleProvider;
import zhy2002.examples.lodgement.gen.node.ProductPackageNameNode;
import zhy2002.examples.lodgement.gen.rule.ChangeFocusErrorRule;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.examples.lodgement.gen.rule.UpdateAddressRefListRule;
import zhy2002.examples.lodgement.rule.ChangeFocusErrorRuleImpl;
import zhy2002.examples.lodgement.rule.ShowErrorListRuleImpl;
import zhy2002.examples.lodgement.rule.UpdateAddressRefListRuleImpl;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

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

//    @Binds @Named("ProductPackageNameNodeRuleProvider") @IntoMap
//    @StringKey("productPackageNameNode-test")
//    abstract RuleProvider<ProductPackageNameNode> provideProductPackageNameNodeTestRuleProvider(
//            ProductPackageNameNodeTestRuleProvider impl
//    );
}



class ProductPackageNameNodeTestRuleProvider implements RuleProvider<ProductPackageNameNode>{

    @Inject
    public ProductPackageNameNodeTestRuleProvider() {}
    @Override
    public void initializeState(ProductPackageNameNode node) {
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {

    }
}