package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductDissatisfactionFlagNodeScope
@Subcomponent(modules = {ProductDissatisfactionFlagNodeModule.class})
public interface ProductDissatisfactionFlagNodeComponent {

    RuleProvider<ProductDissatisfactionFlagNode> getProductDissatisfactionFlagNodeRuleProvider();
    Map<String, RuleProvider<ProductDissatisfactionFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductDissatisfactionFlagNodeModule(ProductDissatisfactionFlagNodeModule module);

        ProductDissatisfactionFlagNodeComponent build();
    }
}
