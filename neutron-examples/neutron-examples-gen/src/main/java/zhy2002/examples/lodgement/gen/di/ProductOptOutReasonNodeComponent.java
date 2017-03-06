package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductOptOutReasonNodeScope
@Subcomponent(modules = {ProductOptOutReasonNodeModule.class})
public interface ProductOptOutReasonNodeComponent {

    ProductOptOutReasonNodeRuleProvider getProductOptOutReasonNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductOptOutReasonNodeModule(ProductOptOutReasonNodeModule module);

        ProductOptOutReasonNodeComponent build();
    }
}
