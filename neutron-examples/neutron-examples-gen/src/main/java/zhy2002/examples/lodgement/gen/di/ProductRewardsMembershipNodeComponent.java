package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductRewardsMembershipNodeModule.class})
public interface ProductRewardsMembershipNodeComponent {


    RuleProvider<ProductRewardsMembershipNode> getProductRewardsMembershipNodeRuleProvider();
    Map<String, RuleProvider<ProductRewardsMembershipNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRewardsMembershipNodeModule(ProductRewardsMembershipNodeModule module);

        ProductRewardsMembershipNodeComponent build();
    }

}
