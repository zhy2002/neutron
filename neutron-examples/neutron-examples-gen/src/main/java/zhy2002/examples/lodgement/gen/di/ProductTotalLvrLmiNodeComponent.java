package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductTotalLvrLmiNodeModule.class})
public interface ProductTotalLvrLmiNodeComponent {

    List<RuleProvider<ProductTotalLvrLmiNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductTotalLvrLmiNodeModule(ProductTotalLvrLmiNodeModule module);

        ProductTotalLvrLmiNodeComponent build();
    }

}
