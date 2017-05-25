package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;

@LodgementNodeScope
@Subcomponent(modules = {LodgementNodeModule.class})
public interface LodgementNodeComponent {

    RuleProvider<LodgementNode> getLodgementNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLodgementNodeModule(LodgementNodeModule module);

        LodgementNodeComponent build();
    }
}
