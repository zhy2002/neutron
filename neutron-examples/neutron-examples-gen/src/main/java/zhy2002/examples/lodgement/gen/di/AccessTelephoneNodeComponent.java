package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AccessTelephoneNodeScope
@Subcomponent(modules = {AccessTelephoneNodeModule.class})
public interface AccessTelephoneNodeComponent {

    RuleProvider<AccessTelephoneNode> getAccessTelephoneNodeRuleProvider();
    Map<String, RuleProvider<AccessTelephoneNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessTelephoneNodeModule(AccessTelephoneNodeModule module);

        AccessTelephoneNodeComponent build();
    }
}
