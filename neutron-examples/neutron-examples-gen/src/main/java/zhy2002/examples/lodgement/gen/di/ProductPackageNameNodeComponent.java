package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductPackageNameNodeScope
@Subcomponent(modules = {ProductPackageNameNodeModule.class})
public interface ProductPackageNameNodeComponent {

    ProductPackageNameNodeRuleProvider getProductPackageNameNodeRuleProvider();
    Map<String, RuleProvider<ProductPackageNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductPackageNameNodeModule(ProductPackageNameNodeModule module);

        ProductPackageNameNodeComponent build();
    }
}
