package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {RealEstateNodeModule.class})
public interface RealEstateNodeComponent {

    RuleProvider<RealEstateNode> getRealEstateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRealEstateNodeModule(RealEstateNodeModule module);

        RealEstateNodeComponent build();
    }
}
