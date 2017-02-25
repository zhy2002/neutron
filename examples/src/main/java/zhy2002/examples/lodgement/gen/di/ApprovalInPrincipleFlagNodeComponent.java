package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ApprovalInPrincipleFlagNodeScope
@Subcomponent(modules = {ApprovalInPrincipleFlagNodeModule.class})
public interface ApprovalInPrincipleFlagNodeComponent {

    ApprovalInPrincipleFlagNodeRuleProvider getApprovalInPrincipleFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setApprovalInPrincipleFlagNodeModule(ApprovalInPrincipleFlagNodeModule module);

        ApprovalInPrincipleFlagNodeComponent build();
    }
}
