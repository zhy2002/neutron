package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {AccessContactTypeNodeModule.class})
public interface AccessContactTypeNodeComponent {

    List<RuleProvider<AccessContactTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setAccessContactTypeNodeModule(AccessContactTypeNodeModule module);

        AccessContactTypeNodeComponent build();
    }

}
