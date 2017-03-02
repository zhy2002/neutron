package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductNameNodeScope
@Subcomponent(modules = {ProductNameNodeModule.class})
public interface ProductNameNodeComponent {

    ProductNameNodeRuleProvider getProductNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductNameNodeModule(ProductNameNodeModule module);

        ProductNameNodeComponent build();
    }
}
