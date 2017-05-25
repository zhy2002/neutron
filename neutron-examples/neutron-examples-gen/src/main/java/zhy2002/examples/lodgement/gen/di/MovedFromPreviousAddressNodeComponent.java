package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MovedFromPreviousAddressNodeScope
@Subcomponent(modules = {MovedFromPreviousAddressNodeModule.class})
public interface MovedFromPreviousAddressNodeComponent {

    RuleProvider<MovedFromPreviousAddressNode> getMovedFromPreviousAddressNodeRuleProvider();
    Map<String, RuleProvider<MovedFromPreviousAddressNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedFromPreviousAddressNodeModule(MovedFromPreviousAddressNodeModule module);

        MovedFromPreviousAddressNodeComponent build();
    }
}
