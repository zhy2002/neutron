package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ProductNodeScope
@Subcomponent(modules = {ProductNodeModule.class})
public interface ProductNodeComponent {

    ProductNodeRuleProvider getProductNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductNodeModule(ProductNodeModule module);

        ProductNodeComponent build();
    }
}
