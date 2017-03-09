package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MovedToPreviousAddressNodeScope
@Subcomponent(modules = {MovedToPreviousAddressNodeModule.class})
public interface MovedToPreviousAddressNodeComponent {

    MovedToPreviousAddressNodeRuleProvider getMovedToPreviousAddressNodeRuleProvider();
    Map<String, RuleProvider<MovedToPreviousAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedToPreviousAddressNodeModule(MovedToPreviousAddressNodeModule module);

        MovedToPreviousAddressNodeComponent build();
    }
}
