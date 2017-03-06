package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductDescriptionNodeScope
@Subcomponent(modules = {ProductDescriptionNodeModule.class})
public interface ProductDescriptionNodeComponent {

    ProductDescriptionNodeRuleProvider getProductDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductDescriptionNodeModule(ProductDescriptionNodeModule module);

        ProductDescriptionNodeComponent build();
    }
}
