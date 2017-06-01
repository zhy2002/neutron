package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductOptOutReasonNodeModule.class})
public interface ProductOptOutReasonNodeComponent {

    List<RuleProvider<ProductOptOutReasonNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductOptOutReasonNodeModule(ProductOptOutReasonNodeModule module);

        ProductOptOutReasonNodeComponent build();
    }

}
