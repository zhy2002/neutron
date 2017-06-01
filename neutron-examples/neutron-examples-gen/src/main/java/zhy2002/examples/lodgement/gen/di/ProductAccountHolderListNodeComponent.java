package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ProductAccountHolderListNodeModule.class})
public interface ProductAccountHolderListNodeComponent {


    RuleProvider<ProductAccountHolderListNode> getProductAccountHolderListNodeRuleProvider();
    Map<String, RuleProvider<ProductAccountHolderListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setProductAccountHolderListNodeModule(ProductAccountHolderListNodeModule module);

        ProductAccountHolderListNodeComponent build();
    }

}
