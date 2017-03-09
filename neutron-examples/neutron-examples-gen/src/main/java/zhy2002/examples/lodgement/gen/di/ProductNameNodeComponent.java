package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductNameNodeScope
@Subcomponent(modules = {ProductNameNodeModule.class})
public interface ProductNameNodeComponent {

    ProductNameNodeRuleProvider getProductNameNodeRuleProvider();
    Map<String, RuleProvider<ProductNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductNameNodeModule(ProductNameNodeModule module);

        ProductNameNodeComponent build();
    }
}
