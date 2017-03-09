package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductDescriptionNodeScope
@Subcomponent(modules = {ProductDescriptionNodeModule.class})
public interface ProductDescriptionNodeComponent {

    ProductDescriptionNodeRuleProvider getProductDescriptionNodeRuleProvider();
    Map<String, RuleProvider<ProductDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductDescriptionNodeModule(ProductDescriptionNodeModule module);

        ProductDescriptionNodeComponent build();
    }
}
