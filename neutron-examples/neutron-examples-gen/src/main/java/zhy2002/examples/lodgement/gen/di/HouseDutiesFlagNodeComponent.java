package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@HouseDutiesFlagNodeScope
@Subcomponent(modules = {HouseDutiesFlagNodeModule.class})
public interface HouseDutiesFlagNodeComponent {

    HouseDutiesFlagNodeRuleProvider getHouseDutiesFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setHouseDutiesFlagNodeModule(HouseDutiesFlagNodeModule module);

        HouseDutiesFlagNodeComponent build();
    }
}
