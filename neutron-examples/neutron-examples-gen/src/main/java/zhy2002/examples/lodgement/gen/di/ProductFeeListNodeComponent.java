package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductFeeListNodeModule.class})
public interface ProductFeeListNodeComponent {

    List<RuleProvider<ProductFeeListNode>> provideRuleProviders();

    ProductFeeNode createProductFeeNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductFeeListNodeModule(ProductFeeListNodeModule module);

        ProductFeeListNodeComponent build();
    }

}
