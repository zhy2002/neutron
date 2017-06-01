package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherLiabilityListNodeModule.class})
public interface OtherLiabilityListNodeComponent {

    List<RuleProvider<OtherLiabilityListNode>> provideRuleProviders();

    OtherLiabilityNode createOtherLiabilityNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityListNodeModule(OtherLiabilityListNodeModule module);

        OtherLiabilityListNodeComponent build();
    }

}
