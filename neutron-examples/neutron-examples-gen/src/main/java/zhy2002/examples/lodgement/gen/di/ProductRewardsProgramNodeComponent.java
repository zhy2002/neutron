package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductRewardsProgramNodeModule.class})
public interface ProductRewardsProgramNodeComponent {

    RuleProvider<ProductRewardsProgramNode> getProductRewardsProgramNodeRuleProvider();
    Map<String, RuleProvider<ProductRewardsProgramNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRewardsProgramNodeModule(ProductRewardsProgramNodeModule module);

        ProductRewardsProgramNodeComponent build();
    }
}
