package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@AccessContactTitleNodeScope
@Subcomponent(modules = {AccessContactTitleNodeModule.class})
public interface AccessContactTitleNodeComponent {

    AccessContactTitleNodeRuleProvider getAccessContactTitleNodeRuleProvider();
    Map<String, RuleProvider<AccessContactTitleNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactTitleNodeModule(AccessContactTitleNodeModule module);

        AccessContactTitleNodeComponent build();
    }
}
