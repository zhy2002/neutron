package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@Product100PercentOffsetFlagNodeScope
@Subcomponent(modules = {Product100PercentOffsetFlagNodeModule.class})
public interface Product100PercentOffsetFlagNodeComponent {

    Product100PercentOffsetFlagNodeRuleProvider getProduct100PercentOffsetFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProduct100PercentOffsetFlagNodeModule(Product100PercentOffsetFlagNodeModule module);

        Product100PercentOffsetFlagNodeComponent build();
    }
}
