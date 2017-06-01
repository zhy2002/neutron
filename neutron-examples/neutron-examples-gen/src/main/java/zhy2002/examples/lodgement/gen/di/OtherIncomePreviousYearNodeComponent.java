package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherIncomePreviousYearNodeModule.class})
public interface OtherIncomePreviousYearNodeComponent {


    RuleProvider<OtherIncomePreviousYearNode> getOtherIncomePreviousYearNodeRuleProvider();
    Map<String, RuleProvider<OtherIncomePreviousYearNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomePreviousYearNodeModule(OtherIncomePreviousYearNodeModule module);

        OtherIncomePreviousYearNodeComponent build();
    }

}
