package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductInterestOnlyTermNodeScope
@Subcomponent(modules = {ProductInterestOnlyTermNodeModule.class})
public interface ProductInterestOnlyTermNodeComponent {

    ProductInterestOnlyTermNodeRuleProvider getProductInterestOnlyTermNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductInterestOnlyTermNodeModule(ProductInterestOnlyTermNodeModule module);

        ProductInterestOnlyTermNodeComponent build();
    }
}
