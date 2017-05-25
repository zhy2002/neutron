package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductFeeListNodeScope
@Subcomponent(modules = {ProductFeeListNodeModule.class})
public interface ProductFeeListNodeComponent {

    RuleProvider<ProductFeeListNode> getProductFeeListNodeRuleProvider();
    Map<String, RuleProvider<ProductFeeListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeeListNodeModule(ProductFeeListNodeModule module);

        ProductFeeListNodeComponent build();
    }
}
