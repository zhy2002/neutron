package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductConsolidationFlagNodeScope
@Subcomponent(modules = {ProductConsolidationFlagNodeModule.class})
public interface ProductConsolidationFlagNodeComponent {

    ProductConsolidationFlagNodeRuleProvider getProductConsolidationFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductConsolidationFlagNodeModule(ProductConsolidationFlagNodeModule module);

        ProductConsolidationFlagNodeComponent build();
    }
}
