package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ProductNameNodeModule.class})
public interface ProductNameNodeComponent {

    List<RuleProvider<ProductNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setProductNameNodeModule(ProductNameNodeModule module);

        ProductNameNodeComponent build();
    }

}
