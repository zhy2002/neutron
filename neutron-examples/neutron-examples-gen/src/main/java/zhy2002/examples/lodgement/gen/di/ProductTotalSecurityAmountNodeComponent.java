package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductTotalSecurityAmountNodeModule.class})
public interface ProductTotalSecurityAmountNodeComponent {


    RuleProvider<ProductTotalSecurityAmountNode> getProductTotalSecurityAmountNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalSecurityAmountNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalSecurityAmountNodeModule(ProductTotalSecurityAmountNodeModule module);

        ProductTotalSecurityAmountNodeComponent build();
    }

}
