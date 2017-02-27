package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductRewardsMembershipNodeScope
@Subcomponent(modules = {ProductRewardsMembershipNodeModule.class})
public interface ProductRewardsMembershipNodeComponent {

    ProductRewardsMembershipNodeRuleProvider getProductRewardsMembershipNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRewardsMembershipNodeModule(ProductRewardsMembershipNodeModule module);

        ProductRewardsMembershipNodeComponent build();
    }
}
