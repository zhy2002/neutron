package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherLiabilityListNodeModule.class})
public interface OtherLiabilityListNodeComponent {


    RuleProvider<OtherLiabilityListNode> getOtherLiabilityListNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityListNodeModule(OtherLiabilityListNodeModule module);

        OtherLiabilityListNodeComponent build();
    }

}
