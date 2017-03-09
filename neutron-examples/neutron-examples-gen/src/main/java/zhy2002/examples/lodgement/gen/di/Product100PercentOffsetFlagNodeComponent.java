package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@Product100PercentOffsetFlagNodeScope
@Subcomponent(modules = {Product100PercentOffsetFlagNodeModule.class})
public interface Product100PercentOffsetFlagNodeComponent {

    Product100PercentOffsetFlagNodeRuleProvider getProduct100PercentOffsetFlagNodeRuleProvider();
    Map<String, RuleProvider<Product100PercentOffsetFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProduct100PercentOffsetFlagNodeModule(Product100PercentOffsetFlagNodeModule module);

        Product100PercentOffsetFlagNodeComponent build();
    }
}
