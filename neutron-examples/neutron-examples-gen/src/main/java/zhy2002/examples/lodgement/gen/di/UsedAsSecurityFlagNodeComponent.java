package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@UsedAsSecurityFlagNodeScope
@Subcomponent(modules = {UsedAsSecurityFlagNodeModule.class})
public interface UsedAsSecurityFlagNodeComponent {

    UsedAsSecurityFlagNodeRuleProvider getUsedAsSecurityFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setUsedAsSecurityFlagNodeModule(UsedAsSecurityFlagNodeModule module);

        UsedAsSecurityFlagNodeComponent build();
    }
}
