package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherIncomePreviousYearNodeScope
@Subcomponent(modules = {OtherIncomePreviousYearNodeModule.class})
public interface OtherIncomePreviousYearNodeComponent {

    OtherIncomePreviousYearNodeRuleProvider getOtherIncomePreviousYearNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomePreviousYearNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomePreviousYearNodeModule(OtherIncomePreviousYearNodeModule module);

        OtherIncomePreviousYearNodeComponent build();
    }
}
