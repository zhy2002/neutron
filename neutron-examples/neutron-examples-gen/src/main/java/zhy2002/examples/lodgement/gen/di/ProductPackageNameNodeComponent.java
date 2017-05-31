package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductPackageNameNodeModule.class})
public interface ProductPackageNameNodeComponent {

    RuleProvider<ProductPackageNameNode> getProductPackageNameNodeRuleProvider();
    Map<String, RuleProvider<ProductPackageNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductPackageNameNodeModule(ProductPackageNameNodeModule module);

        ProductPackageNameNodeComponent build();
    }
}
