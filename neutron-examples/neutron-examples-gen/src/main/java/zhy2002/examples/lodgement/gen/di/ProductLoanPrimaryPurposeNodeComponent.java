package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductLoanPrimaryPurposeNodeModule.class})
public interface ProductLoanPrimaryPurposeNodeComponent {

    List<RuleProvider<ProductLoanPrimaryPurposeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductLoanPrimaryPurposeNodeModule(ProductLoanPrimaryPurposeNodeModule module);

        ProductLoanPrimaryPurposeNodeComponent build();
    }

}
