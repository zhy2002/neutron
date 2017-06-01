package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {AccessOtherDescriptionNodeModule.class})
public interface AccessOtherDescriptionNodeComponent {


    RuleProvider<AccessOtherDescriptionNode> getAccessOtherDescriptionNodeRuleProvider();
    Map<String, RuleProvider<AccessOtherDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessOtherDescriptionNodeModule(AccessOtherDescriptionNodeModule module);

        AccessOtherDescriptionNodeComponent build();
    }

}
