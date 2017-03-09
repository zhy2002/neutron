package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AccessContactFirstNameNodeScope
@Subcomponent(modules = {AccessContactFirstNameNodeModule.class})
public interface AccessContactFirstNameNodeComponent {

    AccessContactFirstNameNodeRuleProvider getAccessContactFirstNameNodeRuleProvider();
    Map<String, RuleProvider<AccessContactFirstNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactFirstNameNodeModule(AccessContactFirstNameNodeModule module);

        AccessContactFirstNameNodeComponent build();
    }
}
