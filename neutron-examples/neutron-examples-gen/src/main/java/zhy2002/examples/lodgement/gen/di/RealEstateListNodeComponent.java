package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {RealEstateListNodeModule.class})
public interface RealEstateListNodeComponent {

    RealEstateNode createRealEstateNode();

    RuleProvider<RealEstateListNode> getRealEstateListNodeRuleProvider();
    Map<String, RuleProvider<RealEstateListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setRealEstateListNodeModule(RealEstateListNodeModule module);

        RealEstateListNodeComponent build();
    }

}
