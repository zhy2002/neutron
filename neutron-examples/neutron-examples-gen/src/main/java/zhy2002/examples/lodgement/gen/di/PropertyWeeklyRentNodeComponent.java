package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {PropertyWeeklyRentNodeModule.class})
public interface PropertyWeeklyRentNodeComponent {

    RuleProvider<PropertyWeeklyRentNode> getPropertyWeeklyRentNodeRuleProvider();
    Map<String, RuleProvider<PropertyWeeklyRentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyWeeklyRentNodeModule(PropertyWeeklyRentNodeModule module);

        PropertyWeeklyRentNodeComponent build();
    }
}
