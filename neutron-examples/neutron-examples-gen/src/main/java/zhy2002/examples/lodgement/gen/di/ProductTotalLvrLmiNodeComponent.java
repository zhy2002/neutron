package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductTotalLvrLmiNodeScope
@Subcomponent(modules = {ProductTotalLvrLmiNodeModule.class})
public interface ProductTotalLvrLmiNodeComponent {

    RuleProvider<ProductTotalLvrLmiNode> getProductTotalLvrLmiNodeRuleProvider();
    Map<String, RuleProvider<ProductTotalLvrLmiNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLvrLmiNodeModule(ProductTotalLvrLmiNodeModule module);

        ProductTotalLvrLmiNodeComponent build();
    }
}
