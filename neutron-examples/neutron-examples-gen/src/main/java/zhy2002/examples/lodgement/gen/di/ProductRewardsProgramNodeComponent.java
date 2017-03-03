package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductRewardsProgramNodeScope
@Subcomponent(modules = {ProductRewardsProgramNodeModule.class})
public interface ProductRewardsProgramNodeComponent {

    ProductRewardsProgramNodeRuleProvider getProductRewardsProgramNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRewardsProgramNodeModule(ProductRewardsProgramNodeModule module);

        ProductRewardsProgramNodeComponent build();
    }
}
