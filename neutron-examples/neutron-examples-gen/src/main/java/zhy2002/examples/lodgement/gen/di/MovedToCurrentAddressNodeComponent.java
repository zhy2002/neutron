package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MovedToCurrentAddressNodeModule.class})
public interface MovedToCurrentAddressNodeComponent extends MonthYearNodeComponent {


    RuleProvider<MovedToCurrentAddressNode> getMovedToCurrentAddressNodeRuleProvider();
    Map<String, RuleProvider<MovedToCurrentAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedToCurrentAddressNodeModule(MovedToCurrentAddressNodeModule module);

        MovedToCurrentAddressNodeComponent build();
    }

}
