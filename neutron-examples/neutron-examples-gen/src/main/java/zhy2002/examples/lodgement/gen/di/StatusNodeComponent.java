package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@StatusNodeScope
@Subcomponent(modules = {StatusNodeModule.class})
public interface StatusNodeComponent {

    StatusNodeRuleProvider getStatusNodeRuleProvider();
    Map<String, RuleProvider<StatusNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setStatusNodeModule(StatusNodeModule module);

        StatusNodeComponent build();
    }
}
