package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductCardHodlerNameNodeModule.class})
public interface ProductCardHodlerNameNodeComponent {

    List<RuleProvider<ProductCardHodlerNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductCardHodlerNameNodeModule(ProductCardHodlerNameNodeModule module);

        ProductCardHodlerNameNodeComponent build();
    }

}
