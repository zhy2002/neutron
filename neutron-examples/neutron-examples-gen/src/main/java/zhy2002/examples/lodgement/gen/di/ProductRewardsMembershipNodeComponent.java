package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductRewardsMembershipNodeScope
@Subcomponent(modules = {ProductRewardsMembershipNodeModule.class})
public interface ProductRewardsMembershipNodeComponent {

    ProductRewardsMembershipNodeRuleProvider getProductRewardsMembershipNodeRuleProvider();
    Map<String, RuleProvider<ProductRewardsMembershipNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRewardsMembershipNodeModule(ProductRewardsMembershipNodeModule module);

        ProductRewardsMembershipNodeComponent build();
    }
}
