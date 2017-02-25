package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.app.gen.*;
import zhy2002.examples.app.gen.rule.*;

@LodgementNodeScope
@Subcomponent(modules = {LodgementNodeModule.class})
public interface LodgementNodeComponent {

    LodgementNodeRuleProvider getLodgementNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLodgementNodeModule(LodgementNodeModule module);

        LodgementNodeComponent build();
    }
}
