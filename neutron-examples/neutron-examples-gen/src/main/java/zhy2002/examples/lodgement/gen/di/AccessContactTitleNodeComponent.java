package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AccessContactTitleNodeModule.class})
public interface AccessContactTitleNodeComponent {

    List<RuleProvider<AccessContactTitleNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactTitleNodeModule(AccessContactTitleNodeModule module);

        AccessContactTitleNodeComponent build();
    }

}
