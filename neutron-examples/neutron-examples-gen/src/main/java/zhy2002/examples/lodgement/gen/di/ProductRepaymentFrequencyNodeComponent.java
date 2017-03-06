package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ProductRepaymentFrequencyNodeScope
@Subcomponent(modules = {ProductRepaymentFrequencyNodeModule.class})
public interface ProductRepaymentFrequencyNodeComponent {

    ProductRepaymentFrequencyNodeRuleProvider getProductRepaymentFrequencyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductRepaymentFrequencyNodeModule(ProductRepaymentFrequencyNodeModule module);

        ProductRepaymentFrequencyNodeComponent build();
    }
}
