package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductTotalLvrLmiNodeScope
@Subcomponent(modules = {ProductTotalLvrLmiNodeModule.class})
public interface ProductTotalLvrLmiNodeComponent {

    ProductTotalLvrLmiNodeRuleProvider getProductTotalLvrLmiNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLvrLmiNodeModule(ProductTotalLvrLmiNodeModule module);

        ProductTotalLvrLmiNodeComponent build();
    }
}
