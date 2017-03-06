package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductAccountHolderListNodeScope
@Subcomponent(modules = {ProductAccountHolderListNodeModule.class})
public interface ProductAccountHolderListNodeComponent {

    ProductAccountHolderListNodeRuleProvider getProductAccountHolderListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductAccountHolderListNodeModule(ProductAccountHolderListNodeModule module);

        ProductAccountHolderListNodeComponent build();
    }
}
