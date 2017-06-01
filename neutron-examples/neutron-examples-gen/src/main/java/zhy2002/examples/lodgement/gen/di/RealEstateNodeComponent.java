package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {RealEstateNodeModule.class})
public interface RealEstateNodeComponent {

    List<RuleProvider<RealEstateNode>> provideRuleProviders();

    UsageNode createUsageNode();
    PropertyNode createPropertyNode();
    AccessNode createAccessNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setRealEstateNodeModule(RealEstateNodeModule module);

        RealEstateNodeComponent build();
    }

}
