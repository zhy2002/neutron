package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@LiabilitiesNodeScope
@Subcomponent(modules = {LiabilitiesNodeModule.class})
public interface LiabilitiesNodeComponent {

    LiabilitiesNodeRuleProvider getLiabilitiesNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLiabilitiesNodeModule(LiabilitiesNodeModule module);

        LiabilitiesNodeComponent build();
    }
}
