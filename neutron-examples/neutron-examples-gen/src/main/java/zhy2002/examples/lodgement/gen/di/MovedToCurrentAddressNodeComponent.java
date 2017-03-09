package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MovedToCurrentAddressNodeScope
@Subcomponent(modules = {MovedToCurrentAddressNodeModule.class})
public interface MovedToCurrentAddressNodeComponent {

    MovedToCurrentAddressNodeRuleProvider getMovedToCurrentAddressNodeRuleProvider();
    Map<String, RuleProvider<MovedToCurrentAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedToCurrentAddressNodeModule(MovedToCurrentAddressNodeModule module);

        MovedToCurrentAddressNodeComponent build();
    }
}
