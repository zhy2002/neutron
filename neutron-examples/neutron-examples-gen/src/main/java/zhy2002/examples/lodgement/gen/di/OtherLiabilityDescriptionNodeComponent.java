package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherLiabilityDescriptionNodeScope
@Subcomponent(modules = {OtherLiabilityDescriptionNodeModule.class})
public interface OtherLiabilityDescriptionNodeComponent {

    RuleProvider<OtherLiabilityDescriptionNode> getOtherLiabilityDescriptionNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityDescriptionNodeModule(OtherLiabilityDescriptionNodeModule module);

        OtherLiabilityDescriptionNodeComponent build();
    }
}
