package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductOptOutReasonNodeModule.class})
public interface ProductOptOutReasonNodeComponent {


    RuleProvider<ProductOptOutReasonNode> getProductOptOutReasonNodeRuleProvider();
    Map<String, RuleProvider<ProductOptOutReasonNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductOptOutReasonNodeModule(ProductOptOutReasonNodeModule module);

        ProductOptOutReasonNodeComponent build();
    }

}
