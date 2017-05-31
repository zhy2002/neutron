package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MovedToPreviousAddressNodeModule.class})
public interface MovedToPreviousAddressNodeComponent {

    RuleProvider<MovedToPreviousAddressNode> getMovedToPreviousAddressNodeRuleProvider();
    Map<String, RuleProvider<MovedToPreviousAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedToPreviousAddressNodeModule(MovedToPreviousAddressNodeModule module);

        MovedToPreviousAddressNodeComponent build();
    }
}
