package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductConstructionApplicationFlagNodeScope
@Subcomponent(modules = {ProductConstructionApplicationFlagNodeModule.class})
public interface ProductConstructionApplicationFlagNodeComponent {

    ProductConstructionApplicationFlagNodeRuleProvider getProductConstructionApplicationFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductConstructionApplicationFlagNodeModule(ProductConstructionApplicationFlagNodeModule module);

        ProductConstructionApplicationFlagNodeComponent build();
    }
}
