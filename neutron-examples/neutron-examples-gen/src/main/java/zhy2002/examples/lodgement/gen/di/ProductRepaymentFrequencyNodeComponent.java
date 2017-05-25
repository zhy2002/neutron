package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductRepaymentFrequencyNodeScope
@Subcomponent(modules = {ProductRepaymentFrequencyNodeModule.class})
public interface ProductRepaymentFrequencyNodeComponent {

    RuleProvider<ProductRepaymentFrequencyNode> getProductRepaymentFrequencyNodeRuleProvider();
    Map<String, RuleProvider<ProductRepaymentFrequencyNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRepaymentFrequencyNodeModule(ProductRepaymentFrequencyNodeModule module);

        ProductRepaymentFrequencyNodeComponent build();
    }
}
