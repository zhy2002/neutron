package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@UsageNodeScope
@Subcomponent(modules = {UsageNodeModule.class})
public interface UsageNodeComponent {

    UsageNodeRuleProvider getUsageNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setUsageNodeModule(UsageNodeModule module);

        UsageNodeComponent build();
    }
}
