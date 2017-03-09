package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AccessContactLastNameNodeScope
@Subcomponent(modules = {AccessContactLastNameNodeModule.class})
public interface AccessContactLastNameNodeComponent {

    AccessContactLastNameNodeRuleProvider getAccessContactLastNameNodeRuleProvider();
    Map<String, RuleProvider<AccessContactLastNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactLastNameNodeModule(AccessContactLastNameNodeModule module);

        AccessContactLastNameNodeComponent build();
    }
}
