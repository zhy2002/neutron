package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductRepaymentFrequencyNodeModule.class})
public interface ProductRepaymentFrequencyNodeComponent {

    List<RuleProvider<ProductRepaymentFrequencyNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductRepaymentFrequencyNodeModule(ProductRepaymentFrequencyNodeModule module);

        ProductRepaymentFrequencyNodeComponent build();
    }

}
