package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductOptOutReasonNodeScope
@Subcomponent(modules = {ProductOptOutReasonNodeModule.class})
public interface ProductOptOutReasonNodeComponent {

    ProductOptOutReasonNodeRuleProvider getProductOptOutReasonNodeRuleProvider();
    Map<String, RuleProvider<ProductOptOutReasonNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductOptOutReasonNodeModule(ProductOptOutReasonNodeModule module);

        ProductOptOutReasonNodeComponent build();
    }
}
