package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductInterestOnlyTermNodeModule.class})
public interface ProductInterestOnlyTermNodeComponent {

    RuleProvider<ProductInterestOnlyTermNode> getProductInterestOnlyTermNodeRuleProvider();
    Map<String, RuleProvider<ProductInterestOnlyTermNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductInterestOnlyTermNodeModule(ProductInterestOnlyTermNodeModule module);

        ProductInterestOnlyTermNodeComponent build();
    }
}
