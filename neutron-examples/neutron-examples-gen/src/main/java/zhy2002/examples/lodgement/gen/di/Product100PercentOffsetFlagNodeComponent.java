package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {Product100PercentOffsetFlagNodeModule.class})
public interface Product100PercentOffsetFlagNodeComponent {

    RuleProvider<Product100PercentOffsetFlagNode> getProduct100PercentOffsetFlagNodeRuleProvider();
    Map<String, RuleProvider<Product100PercentOffsetFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProduct100PercentOffsetFlagNodeModule(Product100PercentOffsetFlagNodeModule module);

        Product100PercentOffsetFlagNodeComponent build();
    }
}
