package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductPackageNameNodeScope
@Subcomponent(modules = {ProductPackageNameNodeModule.class})
public interface ProductPackageNameNodeComponent {

    ProductPackageNameNodeRuleProvider getProductPackageNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductPackageNameNodeModule(ProductPackageNameNodeModule module);

        ProductPackageNameNodeComponent build();
    }
}
