package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherLiabilityTypeNodeScope
@Subcomponent(modules = {OtherLiabilityTypeNodeModule.class})
public interface OtherLiabilityTypeNodeComponent {

    OtherLiabilityTypeNodeRuleProvider getOtherLiabilityTypeNodeRuleProvider();
    Map<String, RuleProvider<OtherLiabilityTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityTypeNodeModule(OtherLiabilityTypeNodeModule module);

        OtherLiabilityTypeNodeComponent build();
    }
}
