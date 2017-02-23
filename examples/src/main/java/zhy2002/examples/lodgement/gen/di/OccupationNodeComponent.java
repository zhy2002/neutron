package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OccupationNodeScope
@Subcomponent(modules = {OccupationNodeModule.class})
public interface OccupationNodeComponent {

    OccupationNodeRuleProvider getOccupationNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOccupationNodeModule(OccupationNodeModule module);

        OccupationNodeComponent build();
    }
}
