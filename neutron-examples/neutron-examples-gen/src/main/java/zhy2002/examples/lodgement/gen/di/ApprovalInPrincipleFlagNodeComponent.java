package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ApprovalInPrincipleFlagNodeModule.class})
public interface ApprovalInPrincipleFlagNodeComponent {

    List<RuleProvider<ApprovalInPrincipleFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setApprovalInPrincipleFlagNodeModule(ApprovalInPrincipleFlagNodeModule module);

        ApprovalInPrincipleFlagNodeComponent build();
    }

}
