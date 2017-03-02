package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductTotalLvrNodeScope
@Subcomponent(modules = {ProductTotalLvrNodeModule.class})
public interface ProductTotalLvrNodeComponent {

    ProductTotalLvrNodeRuleProvider getProductTotalLvrNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLvrNodeModule(ProductTotalLvrNodeModule module);

        ProductTotalLvrNodeComponent build();
    }
}
