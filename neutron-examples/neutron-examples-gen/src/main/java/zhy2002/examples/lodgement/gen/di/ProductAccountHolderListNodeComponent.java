package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ProductAccountHolderListNodeScope
@Subcomponent(modules = {ProductAccountHolderListNodeModule.class})
public interface ProductAccountHolderListNodeComponent {

    ProductAccountHolderListNodeRuleProvider getProductAccountHolderListNodeRuleProvider();
    Map<String, RuleProvider<ProductAccountHolderListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductAccountHolderListNodeModule(ProductAccountHolderListNodeModule module);

        ProductAccountHolderListNodeComponent build();
    }
}
